package com.zy;

public class FinanceReport implements Report{
    @Override
    public void load() {
        System.out.println("FinanceReport load data");
    }

    @Override
    public void print() {
        System.out.println("FinanceReport printing");
    }
}
