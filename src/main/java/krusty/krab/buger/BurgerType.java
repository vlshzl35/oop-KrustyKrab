package krusty.krab.buger;

public enum BurgerType {
    FLABBY_PATTY("뱃살버거"),
    JELLY_PATTY("젤리버거"),
    KRABY_PATTY("크래비버거"),
    KRUSTY_PATTY("크러스티버거"),
    MONSTER_KRABBY_PATTY("몬스터크래비버거"),
    NASTY_PATTY("날티버거"),
    PRETTY_PATTY("프리티버거"),
    SHOES_PATTY("신발버거"),
    SPONGY_PATTY("스펀지버거");

    private String burgerName;

    BurgerType(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getBurgerName() {
        return burgerName;
    }
}