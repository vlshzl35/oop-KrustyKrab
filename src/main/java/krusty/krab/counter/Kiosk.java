package krusty.krab.counter;

import krusty.krab.buger.BurgerRepository;
import krusty.krab.kitchen.Kitchen;

public class Kiosk {
    private int currentOrderNum = 0;
    private Kitchen kitchen = new Kitchen();

    public void orderRandom() {
        Order order = new Order(currentOrderNum++);
        kitchen.startCook(order);
    }
}

