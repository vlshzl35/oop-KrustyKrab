package krusty.krab.kitchen;

import krusty.krab.data.burger.Burger;

import java.util.Scanner;

public class Grill {
    private Scanner sc = new Scanner(System.in);

    public Burger cookHamburger() {
        System.out.println("빵 굽는중...");
        System.out.println("소스를 뿌려주세요!");
        String sauce = sc.nextLine();
        System.out.println("양상추 올리는 중...");
        System.out.println("치즈 올리는 중...");
        System.out.println("패티를 선택해주세요!");
        String patty = sc.nextLine();
        System.out.println("패티 굽는 중...");
        System.out.println("햄버거 완성!");

        return new Burger(sauce, patty);
    }
}
