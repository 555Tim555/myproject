package com.zy.Student

fun main() {
    val stu = Student("Tang",80,100)
    stu.print()
}

class Student(var name : String, var english : Int, var math : Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2)
    }

}