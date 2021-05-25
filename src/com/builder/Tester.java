package com.builder;

public class Tester {
    public static void main(String[] args) {
        EarthquakeResistentBuilder e=new EarthquakeResistentBuilder();

        Director d=new Director(e);
        d.manageRequiredHome();

        Home h=d.getObject();


    }
}
