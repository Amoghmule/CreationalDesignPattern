package com.builder;

public class FloodResistentBuilder implements Builder{

    private Home fHome=new Home();


    @Override
    public void buildFloor() {
        this.fHome.floor="floor hua";
    }

    @Override
    public void buildWalls() {
        this.fHome.walls="walls hue";
    }

    @Override
    public void buildTerrace() {
        this.fHome.terrace="terrace hua";
    }

    @Override
    public Home getObject() {
        return this.fHome;
    }
}
