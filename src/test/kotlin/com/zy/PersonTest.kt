package com.zy

import org.junit.Test
import org.junit.jupiter.api.Assertions

class PersonTest(){
    @Test
    fun bmiTest(){
        val human = Human("Tang",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }

}