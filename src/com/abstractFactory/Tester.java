package com.abstractFactory;

public class Tester {


    public static void main(String[] args) {
        AbstractFactory af=AbstractFactoryProducer.getProfession(false);

        Profession p=af.getProfession("engineer");
        p.print();

    }
}
