package burger;

public class Hamburger {
    private String  bread;
    private String  sauce;
    private String  vegetable;
    private String  cheese;
    private String  patty;

    public Hamburger() {
        this("빵","케찹","양상추, 피클, 토마토","슬라이스 치즈", "쇠고기패티");
    }

    public Hamburger(String bread, String sauce, String vegetable, String cheese, String patty) {
        this.bread = bread;
        this.sauce = sauce;
        this.vegetable = vegetable;
        this.cheese = cheese;
        this.patty = patty;
    }

    public Hamburger(String bread, String vegetable, String cheese) {
        this.bread = bread;
        this.vegetable = vegetable;
        this.cheese = cheese;

    }

    public Hamburger(String bread, String vegetable, String cheese, String patty) {
        this.bread = bread;
        this.vegetable = vegetable;
        this.cheese = cheese;
        this.patty = patty;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", vegetable='" + vegetable + '\'' +
                ", cheese='" + cheese + '\'' +
                ", patty='" + patty + '\'' +
                '}';
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