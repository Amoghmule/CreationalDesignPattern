package com.builder;

public class EarthquakeResistentBuilder implements Builder{

    private Home earHome=new Home();

    @Override
    public void buildFloor() {
       this.earHome.floor="floor build";
    }

    @Override
    public void buildWalls() {
        this.earHome.walls="walls build";
    }

    @Override
    public void buildTerrace() {
        this.earHome.terrace="terrece build";
    }

    @Override
    public Home getObject() {
        return this.earHome;
    }
}
