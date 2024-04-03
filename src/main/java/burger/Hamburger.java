package burger;

public class Hamburger {
    private String  bread;
    private String  sauce;
    private String  vegetable;
    private String  cheese;
    private String  patty;

    public Hamburger() {
        this.bread = "빵";
        this.sauce = "케챱";
        this.vegetable = "양상추";
        this.cheese = "치즈";
        this.patty = "게살";
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getPatty() {
        return patty;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }
}