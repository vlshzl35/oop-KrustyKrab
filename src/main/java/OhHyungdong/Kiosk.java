package OhHyungdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kiosk {
    Hamburger[] hamburgers = new Hamburger[10];
    List<Order> orderList = new ArrayList<>(); //Order들어간 정보들 저장
    public void menu()
    {
        Order order = new Order();
        Random rnd = new Random();
        Order order1 = order.createOrder();
        orderList.add(order1);
        System.out.println("=========제품 준비중입니다.=========");
        System.out.println(orderList);
    }

}

