package com.builder;

public interface Builder {

     void buildFloor();
     void buildWalls();
     void buildTerrace();

     Home getObject();

}
