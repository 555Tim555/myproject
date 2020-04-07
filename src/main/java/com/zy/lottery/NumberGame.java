package com.zy.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract  class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate(); //抽象方法，使其他繼承該類別的子類別都必須實作此方法
}
