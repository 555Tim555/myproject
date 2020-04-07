package com.zy.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {         //static 是 不受SchoolRunner這個類別影響就可以使用的方法
        //userInput();
        //com.Kotlin.Student.getPass();  //因為Java和Kotlin的package盟稱相同，所以要使用類別時，有一個會使用全名。
                                       //而且在Kotlin裡已有添加@JvmStatic，所以不需要透過.Companion來取得pass的資料
       // System.out.println(com.Kotlin.Student.getPass());
        Student.pass = 50;
        Student stu = new Student("Tang",80,10);
        Student stu2 = new Student("Tanq",55,48);
        Student stu3 = new Student("Tana",26,10);

        stu.print();
        stu2.print();
        stu3.print();
        GraduateStudent gstu = new GraduateStudent("Jack",55,65,70);
        gstu.print();
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
