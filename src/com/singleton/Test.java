package com.singleton;

public class Test {

    public static void main(String[] args) {

        SingletonClass singletonClass=SingletonClass.getInstance();
        singletonClass.printSingleton();

        SingletonClass singletonClass1=SingletonClass.getInstance();
        singletonClass1.printSingleton();

    }
}
