package burger;

public class JellyPatty extends Hamburger{
    //젤리버거
    private String sauce="해파리잼";
    private String patty= "해파리패티";

    public JellyPatty(){
    }

    public JellyPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
        super(bread, vegetable, cheese);
        this.sauce = sauce;
        this.patty = patty;
    }

    @Override
    public String getSauce() {
        return sauce;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String getPatty() {
        return patty;
    }

    @Override
    public void setPatty(String patty) {
        this.patty = patty;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + getBread() + '\'' +
                ", sauce='" + sauce + '\'' +
                ", vegetable='" + getVegetable() + '\'' +
                ", cheese='" + getCheese() + '\'' +
                ", patty='" + patty + '\'' +
                '}';
    }
}
