package com.zy;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight,float height){
        this.weight=weight;
        this.height=height;
    }

    public Person(String name,float weight,float height){
        this(weight,height);
        this.name = name;
    }

    public void Information(){
        System.out.println("name = "+name);
        System.out.println("weight = "+weight);
        System.out.println("height = "+height);
    }

    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello world");
    }
}
