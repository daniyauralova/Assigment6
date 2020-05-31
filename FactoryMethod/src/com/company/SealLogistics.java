package com.company;

public class SealLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

