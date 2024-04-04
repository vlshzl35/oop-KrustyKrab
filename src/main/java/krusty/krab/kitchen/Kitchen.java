package krusty.krab.kitchen;

import krusty.krab.counter.Order;

public class Kitchen {
    private final Display DISPLAY;
    private final Grill GRILL;
    private final CheckOrder CHECK_ORDER;

    public Kitchen() {
        DISPLAY = new Display();
        GRILL = new Grill();
        CHECK_ORDER = new CheckOrder();
    }

    public void startCook(Order order) {
        System.out.println("우와! 햄버거 주문이" + order.getBurgersNum() + "개 들어왔어!");
        for (int i = 0; i < order.getBurgersNum(); i++) {
            while (true) {
                DISPLAY.printRecipe(order.getBurgerAtIndex(i));
                if (CHECK_ORDER.checkOrder(order.getBurgerAtIndex(i), GRILL.cookHamburger())) {
                    break;
                } else {
                    System.out.println("이건 좀... 괜찮아, 또 다시 시도해 보면 돼.");
                    System.out.println("모든 요리사는 실수할 때가 있으니까, 중요한 건 그걸 극복하는 거야.");
                }
            }
        }
        System.out.println(order.getOrderNum() + "번 손님~ 주문하신 햄버거 나왔습니다!");
    }
}
