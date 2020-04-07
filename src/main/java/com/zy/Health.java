package com.zy;

public class Health implements Report{

    @Override
    public void load() {
        System.out.println("Health load data");
    }

    @Override
    public void print() {
        System.out.println("Health printing");
    }
}
