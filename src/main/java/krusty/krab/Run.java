package krusty.krab;

import krusty.krab.counter.Kiosk;

public class Run {
    private int orderNum;
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.orderRandom();
    }
}
