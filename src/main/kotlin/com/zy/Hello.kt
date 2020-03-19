package com.zy

fun main() {
    //print("Hello Kotlin")
    var s :String? = "abcde"
    //s = null
    println(s?.length)
    println(s?.get(3))

    val h = Human("Tim",66.5f,1.7f)
    println(h.bmi())
    var score = 80
    println(score > 60)
    var c : Char = 'A'
    println(c.toInt() > 60)
   /* var age=19
    age=20
    var weight = 66.5
    var name : String = "Tang"
    print(name)*/
}

class Human(var weight : Float, var height : Float){

    init {
        println("test $weight")
    }

    constructor(name : String, weight: Float,height: Float) : this(weight,height){
        println("test2 $name")
    }



    fun bmi():Float{
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}