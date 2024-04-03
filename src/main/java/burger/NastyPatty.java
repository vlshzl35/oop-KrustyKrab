package burger;

public class NastyPatty extends Burger {
    //냄새 버거
    private String sauce = "매운 핫소스";
    private String sauce2 = "썩은 마요네즈";

    private String etc = "깎아놓은 발톱";

    public NastyPatty(){
    }

    public NastyPatty(String bread, String vegetable, String cheese, String sauce, String sauce2, String patty,String etc) {
        super(bread, vegetable, cheese, patty);
        this.sauce = sauce;
        this.sauce2 = sauce2;
        this.etc = etc;
    }

    @Override
    public String getSauce() {
        return sauce;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce2() {
        return sauce2;
    }

    public void setSauce2(String sauce2) {
        this.sauce2 = sauce2;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + getBread() + '\'' +
                ", sauce='" + sauce + '\'' +
                ", sauce2='" + sauce2 + '\'' +
                ", vegetable='" + getVegetable() + '\'' +
                ", cheese='" + getCheese() + '\'' +
                ", patty='" + getPatty() + '\'' +
                ", etc ='" + etc + '\'' +
                '}';
    }
}

