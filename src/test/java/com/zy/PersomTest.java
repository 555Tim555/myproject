package com.zy;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersomTest {
    @Test
    public void bmiTest(){
        Person person = new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi());
    }
}
