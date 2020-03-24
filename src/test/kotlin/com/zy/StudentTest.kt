package com.zy

import com.Kotlin.Student
import org.junit.Test
import org.junit.jupiter.api.Assertions

class StudentTest(){
    @Test
    fun gradingTest(){
        val student = Student("Tang",60,90)
        Assertions.assertEquals('C',student.grading())
    } 

    @Test
    fun highestScoreTest(){
        val student = Student("Tang",60,90)
        Assertions.assertEquals(90,student.highest())
    }

    @Test
    fun averageTest(){
        val student = Student("Tang",60,90)
        Assertions.assertEquals((60+90)/2,student.getAverage())
    }


}