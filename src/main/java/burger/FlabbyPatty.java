package burger;

public class FlabbyPatty extends Hamburger{
    //뱃살버거
    private String sauce = "뱃살소스";
    private String patty = "뱃살패티";

    public FlabbyPatty(){
    }

    public FlabbyPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
        super(bread, vegetable, cheese,sauce,patty);
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
