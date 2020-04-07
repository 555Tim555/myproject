package com.Kotlin

import com.zy.Student.GraduateStudent
import java.util.*

fun main() {
//    userInput()
    val stu = Student("Tang", 60, 100)
    val stu2 = Student("Tanq", 50, 49)
    val stu3 = Student("Tana", 33, 20)
    stu.print()
    stu2.print()
    stu3.print()
    val gstu = GraduateStudent("Tana", 55, 65,70)
    gstu.print()
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

class Graduate(name: String?, english:Int, math:Int, var thesis:Int):Student(name,english,math){
    //後面的Student(參數)等於java中的super()呼叫父類別建構子，而且父類別需要添加open關鍵字開放給別人繼承
    //因為不添加open的話，除了為Public之外會是final的類型。
    //因為父類別並沒有thesis的變數，所以需要宣告一個變數
    companion object{
        var pass = 70
    }

    override fun print() {       //要使用父類別的print方法依樣要加open
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed(): String  = if(getAverage() >= pass) "PASS" else "FAILED" //因為pass還是使用到父類別的pass=60，所以需要去改寫。

    override fun getAverage(): Int = (english+math+thesis)/3
}

open class Student(var name : String?, var english : Int, var math : Int){

    companion object{           //像Java 的static方法，屬於類別層級，只是kotlin需使用 companion object，將要變成類別層級的資料放入這個區塊中。
        @JvmStatic  //假如要讓Java使用Kotlin的方法的話，需添加這一行，可以省去一層添加companion來取得資料
        var pass = 60
        fun test(){
            println("Test")
        }
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    open fun passOrFailed() = if(getAverage() >= 60) "PASS" else "FAILED"

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

    open fun getAverage() = (english+math)/2

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