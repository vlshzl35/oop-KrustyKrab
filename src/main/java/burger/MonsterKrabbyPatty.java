package burger;

public class MonsterKrabbyPatty extends Hamburger{
    //괴물 게살버거
    private String sauce = "괴물게살소스";
    private String patty = "괴물게살패티";

    public MonsterKrabbyPatty(){
    }

    public MonsterKrabbyPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
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
}