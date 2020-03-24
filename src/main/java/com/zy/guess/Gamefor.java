package com.zy.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        for(int i = 1; i <= 4; i++){
            System.out.println("Please enter a number("+i+"/4):");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("第"+i+"次:"+number);
            if(number > secret) System.out.println("lower");
            else if(number < secret) System.out.println("higher");
            else {
                System.out.println("Great, the number is number:"+i);
                break;
            }
        }
    }
}
