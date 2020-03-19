package com.zy.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //userInput();
        Student stu = new Student("Tang",80,10);
        stu.print();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name:");
        String name = scanner.next();
        System.out.println("Please enter student english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student math:");
        int math = scanner.nextInt();

        //Student stu = new Student(name,english,math);
        Student stu = new Student("Tang",80,100);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
