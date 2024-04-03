package krusty.krab.buger;

import burger.*;

import java.util.EnumSet;

public class BurgerRepository {
    private final Burger[] BURGERS;


    public BurgerRepository() {
        BURGERS = new Burger[9];
        BURGERS[0] = new FlabbyPatty();
        BURGERS[1] = new JellyPatty();
        BURGERS[2] = new KrabyPatty();
        BURGERS[3] = new KrustyDogs();
        BURGERS[4] = new MonsterKrabbyPatty();
        BURGERS[5] = new NastyPatty();
        BURGERS[6] = new PrettyPatty();
        BURGERS[7] = new ShoesPatty();
        BURGERS[8] = new SpongyPatty();
        BURGERS[0] = new SpongyPatty();
    }

    public Burger[] getBurgers() {
        return BURGERS;
    }

    public Burger getBurger(int index) {
        return new Burger(BURGERS[index]);
    }
}
