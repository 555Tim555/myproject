package com.zy;

public class Ticket {
    int origin;
    int distance;
    int money;

    public Ticket() {
    }

    public Ticket(int origin, int distance, int money) {
        this.origin = origin;
        this.distance = distance;
        this.money = money;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
