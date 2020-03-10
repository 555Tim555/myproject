package com.zy

fun main() {
    //print("Hello Kotlin")
    val h = Human().hello()

    var age=19
    age=20
    var weight = 66.5
    var name : String = "Tang"
    print(name)
}

class Human(){
    fun hello(){
        println("Hello Kotlin")
    }
}