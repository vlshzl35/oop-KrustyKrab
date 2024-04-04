package krusty.krab.counter;

import krusty.krab.data.burger.Burger;
import krusty.krab.data.BurgerRepository;

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
        // 햄버거 수 랜덤 설정
        int randomNum = (int) (Math.random() * (burgerRepository.getLength() - 1) + 1);
        burgers = new Burger[randomNum];
        // 햄버거 메뉴 랜덤으로 선택
        Set<Integer> randomNumSet = new TreeSet<>();
        while (randomNumSet.size() < randomNum) {
            randomNumSet.add((int)(Math.random() * burgerRepository.getLength()));
        }
        // 햄버거 메뉴 대입
        List<Integer> randomNumList = randomNumSet.stream().toList();
        for (int i = 0; i < randomNum; i++) {
            burgers[i] = burgerRepository.getBurger(randomNumList.get(i));
        }
    }

    public int getOrderNum() {
        return orderNum;
    }

    public int getBurgersNum() {
        return burgers.length;
    }

    public Burger getBurgerAtIndex(int index) {
        return new Burger(burgers[index]);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", burgers=" + Arrays.toString(burgers) +
                '}';
    }
}
