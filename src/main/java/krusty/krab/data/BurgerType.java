package krusty.krab.data;

import krusty.krab.data.burger.*;

public enum BurgerType {
    FLABBY_PATTY(new FlabbyPatty()),
    JELLY_PATTY(new JellyPatty()),
    KRABY_PATTY(new KrabbyPatty()),
    KRUSTY_PATTY(new KrustyDogs()),
    MONSTER_KRABBY_PATTY(new MonsterKrabbyPatty()),
    NASTY_PATTY(new NastyPatty()),
    PRETTY_PATTY(new PrettyPatty()),
    SHOES_PATTY(new ShoesPatty()),
    SPONGY_PATTY(new SpongyPatty());

    private Burger burgerClass;

    BurgerType(Burger burgerClass) {
        this.burgerClass = burgerClass;
    }

    public Burger getBurger() {
        return burgerClass;
    }
}