package com.Kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("Tang", 60, 100)
    stu.print()
    var test = 123
    println("test: $test")   //如果是變數的話直接加$即可
    println("High score: ${stu.highest()}")   //如果是呼叫方法的話，要加大括號
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student name:")
    // var name = scanner.next()
    var name = null
    print("Please enter student english:")
    var english = scanner.nextInt()
    print("Please enter student math:")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
    stu.namelen()
}

class Student(var name : String?, var english : Int, var math : Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun passOrFailed() = if(getAverage() >= 60) "PASS" else "FAILED"

    /*fun grading() : Char{
        var average = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return average
    }*/

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english+math)/2

    fun  highest() = if(english > math) {      //可直接在等號的右邊做if else判斷
        println("english")
        english              //要設定的值只要在等號的最後一行就可以回傳設定
    } else {
        println("math")
        math
    }

    fun namelen(){
        println(name?.length)
    }

}