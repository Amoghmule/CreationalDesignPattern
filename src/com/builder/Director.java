package com.builder;

public class Director {

    private  Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Home getObject(){
        return this.builder.getObject();
    }

    public  void manageRequiredHome(){
        this.builder.buildFloor();
        this.builder.buildTerrace();
        this.builder.buildWalls();
    }
}
