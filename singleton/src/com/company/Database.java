package com.company;

public class Database {
    private static Database instance = null;
    public String s;

    private Database() {
        s = "Hello !!!";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}