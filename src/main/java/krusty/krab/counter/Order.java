package krusty.krab.counter;

import burger.Burger;
import krusty.krab.buger.BurgerRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Order {
    private int orderNum;
    private Burger[] burgers;

    public Order(int orderNum) {
        this.orderNum = orderNum;

        BurgerRepository burgerRepository = new BurgerRepository();
        Burger[] burgerMenu = burgerRepository.getBurgers();

        // 햄버거 수 랜덤 설정
        int randomNum = (int) (Math.random() * (burgerMenu.length - 1) + 1);
        burgers = new Burger[randomNum];

        // 햄버거 메뉴 랜덤으로 선택
        Set<Integer> randomNumSet = new TreeSet<>();
        while (randomNumSet.size() < randomNum) {
            randomNumSet.add((int)(Math.random() * burgerMenu.length));
        }

        // 햄버거 메뉴 대입
        List<Integer> randomNumList = randomNumSet.stream().toList();
        for (int i = 0; i < randomNum; i++) {
            burgers[i] = burgerMenu[randomNumList.get(i)];
        }
    }

    public int getOrderNum() {
        return orderNum;
    }

    public Burger[] getBurgers() {
        return burgers.clone();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", burgers=" + Arrays.toString(burgers) +
                '}';
    }
}
