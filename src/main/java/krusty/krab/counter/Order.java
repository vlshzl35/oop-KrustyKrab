package krusty.krab.counter;



import OhHyungdong.Hamburger;

import java.util.Random;

public class Order
{
    private Hamburger[] hamburgers;
    private int guestId;
    private int menuId;
    private String menuName;

    @Override
    public String toString() {
        return "주문번호 : " + guestId +
                ", 제품 이름 : '" + menuName + '\'';
    }
    public Order() {
        this.hamburgers = new Hamburger[5];
        hamburgers[0] = new Hamburger(0,"게살버거");
        hamburgers[1] = new Hamburger(1,"행운버거");
        hamburgers[2] = new Hamburger(2,"이쁜이버거");
        hamburgers[3] = new Hamburger(3,"슈퍼게살버거");
        hamburgers[4] = new Hamburger(4,"젤리버거");
    }
    public Order createOrder(){
        Random rnd = new Random();
        int guestId = rnd.nextInt(100) + 1;
        int burgerId = rnd.nextInt(3) + 0;
        String menuName = hamburgers[burgerId].getName();
        Order order = new Order(guestId,burgerId,menuName);
        return order;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public Order(int guestId, int menuId, String menuName) {
        this.guestId = guestId;
        this.menuId = menuId;
        this.menuName = menuName;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
