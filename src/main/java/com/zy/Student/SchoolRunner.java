package com.zy.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student name:");
        String name = scanner.next();
        System.out.print("Please enter student english:");
        int english = scanner.nextInt();
        System.out.print("Please enter student math:");
        int math = scanner.nextInt();

        //Student stu = new Student(name,english,math);
        Student stu = new Student("Tang",80,100);
        stu.print();
    }
}
