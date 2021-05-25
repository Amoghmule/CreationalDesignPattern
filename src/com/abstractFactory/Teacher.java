package com.abstractFactory;

public class Teacher implements Profession{

    @Override
    public void print() {
        System.out.println("Hi! this is Teacher");
    }
}
