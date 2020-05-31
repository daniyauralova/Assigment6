package com.company;

public class Main {

    public static void main(String[] args) {
            Database f = Database.getInstance();
            Database f1 = Database.getInstance();

            System.out.println(f.s);
            System.out.println(f1.s);

            f.s = f.s.toUpperCase();

            System.out.println(f.s);
            System.out.println(f1.s);
        }
    }

