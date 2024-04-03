public class Kitchen {
    private Display display;
    private Grill grill;
    private OrderCheck orderCheck;

    public Kitchen() {
        display = new Display();
        grill = new Grill();
        orderCheck = new OrderCheck();
    }

    public void startCook(Object object) {
        while (true) {
            display.printRecipe();
            if (orderCheck.checkOrder(grill.cookHamburger())) {
                System.out.println("주문하신 햄버거 나왔습니다! :)");
                break;
            }
            else {
                System.out.println("엇.. 다시 만들어 오겠습니다! ^^;");
            }
        }
    }
}
