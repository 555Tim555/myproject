package com.zy.guess

import kotlin.random.Random

fun main() {
    val secret = (1..10).random()
    println(secret)
    var number = 0
    while(number != secret)
    {
        print("Please enter a number:")
        number = readLine()!!.toInt() //因為readLine是傳回字串，有null的疑慮，所以用2個金嘆號強制說會做null的判斷
        if(number < secret){
            println("higher")
        }
        else if(number > secret){
            println("lower")
        }
        else{
            println("Great, the number is $number")
        }
    }
}