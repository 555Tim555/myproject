package com.zy

import java.io.File
import java.io.FileWriter

fun main() {
    File("data.txt").bufferedReader().lines().forEach{
        //讀資料進來的話，可用bufferedReader()，讀取全部的資料並一行一行讀取lines()，再使用for each來做資料的輪因出資料
        println(it)
    }
    //Write()
}

private fun Write() {
    //    File("output.txt").writeText("abc123")   //直接用File和點writeText就可以寫出資料了
    File("output.txt").printWriter().use {
        //取得File物件，使用printWriter()串流(像java stream)，在使用use區塊，表示要做的事情。
        //此區塊可使用it代表printWriter()這個物件可使用的方法
        //use 會自動幫我們flush及close所以不用自己添加
        it.println("1st line")
        it.println("2nd line")
        it.println("3nd line")

    }
}

private fun BufferWrite() {         //用於大量寫出資料時 bufferedWriter
    //    File("output.txt").writeText("abc123")   //直接用File和點writeText就可以寫出資料了
    File("output.txt").bufferedWriter().use {
        //取得File物件，使用printWriter()串流(像java stream)，在使用use區塊，表示要做的事情。
        //此區塊可使用it代表printWriter()這個物件可使用的方法
        //use 會自動幫我們flush及close所以不用自己添加
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3nd line\n")

    }
}