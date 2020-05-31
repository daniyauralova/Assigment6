package com.company;

public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Deliver by sea in the box!";
    }
}
