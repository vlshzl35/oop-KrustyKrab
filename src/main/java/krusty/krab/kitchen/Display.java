package krusty.krab.kitchen;

import krusty.krab.data.burger.Burger;

public class Display {
    public void printRecipe(Burger burger) {
        System.out.println("==============================");
        System.out.println(burger.getName() + "의 조리법");
        System.out.println("------------------------------");
        System.out.print(burger.getBread() + " / ");
        System.out.print(burger.getSauce() + " / ");
        System.out.print(burger.getVegetable() + " / ");
        System.out.print(burger.getCheese() + " / ");
        System.out.print(burger.getPatty());
        System.out.println();
        System.out.println("==============================");
    }
}
