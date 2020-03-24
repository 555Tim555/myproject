package com.zy;

import com.Kotlin.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {
    @Test
    public void highestScoreTest(){
        Student student = new Student("Tang",80,90);
        Assertions.assertEquals(90,student.highest());
    }
    @Test
    public void averageTest(){
        Student student = new Student("Tang",80,90);
        Assertions.assertEquals((80+90)/2,student.getAverage());
    }


}
