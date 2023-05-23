package com.example.project;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class Planet {

    private String name;
    private int size;
    private int cost;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Planet(String name, int size, int cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }







}
