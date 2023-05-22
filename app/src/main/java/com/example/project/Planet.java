package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Planet {

    private String name;
    @SerializedName("size")
    private int circumference;
    @SerializedName("cost")
    private int year;

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", circumference=" + circumference +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public int getCircumference() {
        return circumference;
    }

    public int getYear() {
        return year;
    }

    public Planet(String name, int circumference, int year) {
        this.name = name;
        this.circumference = circumference;
        this.year = year;
    }



}
