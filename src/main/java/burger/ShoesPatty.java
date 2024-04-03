package burger;

public class ShoesPatty extends Hamburger{
    // 구두버거
    private String sauce = "단백질소스";
    private String patty = "구두패티";

    public ShoesPatty(){
    }

    public ShoesPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
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
