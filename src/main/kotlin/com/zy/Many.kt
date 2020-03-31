package com.zy

fun main() {
    //Kotlin的集合有分兩大類，第一類是可變的，第二類是不可變的。
    //可變的是建立集合物件後，可以再添加資料。(Mutable)
    //不可變的是建立集合物件後，不能再添加資料。(immutable)
    val list = listOf(1,3,5,7)  //不可變的
    println(list)

    val scores = listOf(55,66,77,88)//不可變的
    for(score in scores){
        println(score)
    }

    var mutableList = mutableListOf(1,3,5,4,2) //可變的
    mutableList.add(9)
    println(mutableList)

}