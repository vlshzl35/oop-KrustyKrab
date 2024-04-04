package krusty.krab.counter;

import krusty.krab.kitchen.Kitchen;

public class Kiosk {
    private int currentOrderNum = 0;
    private final Kitchen KITCHEN = new Kitchen();

    public void orderRandom() {
        Order order = new Order(currentOrderNum++);
        KITCHEN.startCook(order);
    }
}

