package com.zy.lottery;

import java.util.Random;

public class Game539 extends NumberGame{

    @Override
    public void generate() {
        Random random = new Random();
        int rnd;
        int i=0;
        do{
            rnd = random.nextInt(39);
            numbers.add(rnd);
            i++;
        }while(i<5);
        System.out.println(numbers.size());
        for(int number : numbers)
        {
            System.out.print(number+"\t");
        }
    }
}
