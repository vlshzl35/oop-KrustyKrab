package krusty.krab.kitchen;

import krusty.krab.data.burger.Burger;

public class CheckOrder {
    public boolean checkOrder(Burger orderBurger, Burger cookBurger) {
        return orderBurger.equals(cookBurger) && orderBurger.hashCode() == cookBurger.hashCode();
    }
}
