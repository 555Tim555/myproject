package com.zy.Student

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter student name:")
    var name = scanner.next()
    print("Please enter student english:")
    var english = scanner.nextInt()
    print("Please enter student math:")
    var math = scanner.nextInt()

    val stu = Student(name,english,math)
    stu.print()
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2)
    }

}