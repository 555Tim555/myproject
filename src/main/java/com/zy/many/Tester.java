package com.zy.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //Map:有兩個參數 Hash<Key,Value>。Key是輸入的鍵值，Value是該輸入鍵值所對應的資料
        HashMap<String,String> stocks = new HashMap<>();     //宣告Key及Value都是String的參數。Key不具重複性且不能用index取值。
        stocks.put("2330","台積電"); //Map使用put來放資料
        stocks.put("2317","鴻海");
        stocks.put("2330","TSMC"); //因為Key值重複，所以先前的Value值會被之後的取代。
        System.out.println(stocks);
        for(String stock : stocks.keySet()){         //須先取得Key值
            System.out.println(stocks.get(stock));   //再取得Key值所對應的Value
        }
        //Set
        //set();
        //List();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();   //HashSet 資料不重覆性且沒有排序(順序)可言，也不能用index取值。
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for(int n : set){          //因為set沒有get的方法，所以只能一個一個取值
            System.out.println(n);
        }
    }

    private static void List() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println(list.size());
        //arrayTest();
        List<Integer> scores = Arrays.asList(55,66,77,88,99);  //可以用Arrays.asList添加資料，省去要一直用add增加資料的麻煩。
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
