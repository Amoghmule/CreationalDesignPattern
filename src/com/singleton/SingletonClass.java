package com.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass= new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance(){
        return singletonClass;
    }

    public void printSingleton(){
        System.out.println("hashcode of this class is "+singletonClass);
    }
}
