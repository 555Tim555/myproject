package com.zy.Student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        return (english > math)?english:math;
    }

    public void print(){
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" + ((getAverage() >= 60)? "PASS" : "FAILED"));
        char grade;
        switch (average/10)
        {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("\t" + grade);

        /*if(getAverage() >= 60){
            System.out.print("\tPASS");
        }
        else{
            System.out.print("\tFAILED");
        }*/
    }

    public int getAverage(){
        return (english+math)/2;
    }
}
