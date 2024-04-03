package burger;

public class PrettyPatty extends Burger {
    //이쁜이 버거
    private String sauce = "무지개소스";
    private String patty = "무지개패티";

    public PrettyPatty(){
    }

    public PrettyPatty(String bread, String vegetable, String cheese, String sauce, String patty) {
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

