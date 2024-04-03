public class Kitchen {
    private final Display DISPLAY;
    private final Grill GRILL;
    private final CheckOrder CHECKORDER;

    public Kitchen() {
        DISPLAY = new Display();
        GRILL = new Grill();
        CHECKORDER = new CheckOrder();
    }

    public void startCook(Object object) {
        while (true) {
            DISPLAY.printRecipe();
            if (CHECKORDER.checkOrder(GRILL.cookHamburger())) {
                System.out.println("주문하신 햄버거 나왔습니다! :)");
                break;
            }
            else {
                System.out.println("엇.. 다시 만들어 오겠습니다! ^^;");
            }
        }
    }
}
