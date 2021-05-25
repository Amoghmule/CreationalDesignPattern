package com.factory;

public class Tester {
    public static void main(String[] args) {
        ProfessionFactory pf= new ProfessionFactory();

        Profession p=pf.getProfession("doctor");
        p.print();
    }
}
