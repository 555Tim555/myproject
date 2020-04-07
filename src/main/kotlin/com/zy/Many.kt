package com.zy

import java.time.LocalDateTime

fun main() {
    //Map 停車場範例
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2020,4,1,8,0,0)
    var car : Car? = Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car = Car("AAA-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    car = parkingLot.get("AAA-0001")      //取得第一台車資訊
    //car 1 leaving
    var leave = LocalDateTime.of(2020,4,1,9,0,0)
    car?.leave = leave
    println("${car?.id} duration:${car?.duration()}")
    println("cost:${Math.ceil(car!!.duration()/60.0).toInt()*30}")
    parkingLot.remove(car?.id);       //當第一台車離開時，移除資訊
    println(parkingLot.size)          //印出看剩下幾台車
    //car 2 leaving
    car = parkingLot.get("AAA-0002")      //取得第二台車資訊
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration:${car?.duration()}")
    println("cost:${Math.ceil(car!!.duration()/60.0).toInt()*30}")
    parkingLot.remove(car?.id);       //當第一台車離開時，移除資訊
    println(parkingLot.size)          //印出看剩下幾台車
    //List()

}

private fun List() {
    //Kotlin的集合有分兩大類，第一類是可變的，第二類是不可變的。
    //可變的是建立集合物件後，可以再添加資料。(Mutable)
    //不可變的是建立集合物件後，不能再添加資料。(immutable)
    val list = listOf(1, 3, 5, 7)  //不可變的
    println(list)

    val scores = listOf(55, 66, 77, 88)//不可變的
    for (score in scores) {
        println(score)
    }

    var mutableList = mutableListOf(1, 3, 5, 4, 2) //可變的
    mutableList.add(9)
    println(mutableList)
}