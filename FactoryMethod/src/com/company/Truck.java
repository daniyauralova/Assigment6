package com.company;

public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Deliver by land in the box";
    }
}
