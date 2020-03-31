package com.zy.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println(list.size());
        //arrayTest();
        List<Integer> scores = Arrays.asList(55,66,77,88,99);  //可以用Arrays.asList添加資料，省去要一值用add增加資料的麻煩。
        for(int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[4] = 5;
        int[] score = {55,66,77,88,99};
        for(int i=0; i<5; i++){
            System.out.println(score[i]);
        }

        for(int n : score){          //for each用法，冒號左邊放變數，右邊放陣列名稱，它會將陣列的值一個一個放進n裡。
            System.out.println(n);
        }
    }
}
