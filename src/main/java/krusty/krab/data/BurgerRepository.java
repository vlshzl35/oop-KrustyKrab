package krusty.krab.data;

import krusty.krab.data.burger.*;

import java.util.EnumSet;

public class BurgerRepository {
    private final Burger[] BURGERS;

    public BurgerRepository() {
        EnumSet<BurgerType> burgerTypes = EnumSet.allOf(BurgerType.class);
        BURGERS = new Burger[burgerTypes.size()];

        int index = 0;
        for (BurgerType burgerType : burgerTypes) {
            BURGERS[index++] = burgerType.getBurger();
        }
    }

    public int getLength() {
        return BURGERS.length;
    }

    public Burger getBurger(int index) {
        return new Burger(BURGERS[index]);
    }
}
