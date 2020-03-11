package com.zy;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person("Tim",66.5f,1.7f);
        p.hello();
        p.Information();
        p.height = 1.7f;
        p.weight = 66.5f;
        System.out.println("BMI= "+p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = 'm';
        Character c2 = 'A';
        byte b = 120;
        float f = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/
    }
}
