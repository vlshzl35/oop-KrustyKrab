package burger;

public class SpongyPatty extends Hamburger{
    //스폰지밥 버거
    private String sauce = "스폰지소스";
    private String patty = "스폰지패티";

    public SpongyPatty(){
    }

    public SpongyPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
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
