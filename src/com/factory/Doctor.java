package com.factory;

public class Doctor implements Profession{

    @Override
    public void print() {
        System.out.println("Hi! this is doctor");
    }
}
