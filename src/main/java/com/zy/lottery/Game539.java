package com.zy.lottery;

import java.util.Random;

public class Game539 extends NumberGame{

    @Override
    public void generate() {
        Random random = new Random();
        int rnd;
        int flag = 0;
        while(numbers.size()<5){
            rnd = random.nextInt(39)+1;
            for(int n : numbers)
            {
                if(rnd == n){
                    rnd = random.nextInt(39)+1;
                    numbers.add(rnd);
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                numbers.add(rnd);
                flag=0;
            }

        }
        //System.out.println(numbers.size());
        for(int number : numbers)
        {
            System.out.print(number+"\t");
        }
    }
}
