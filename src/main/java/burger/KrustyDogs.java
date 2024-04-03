package burger;

public class KrustyDogs extends Burger {
    //집게리아 핫도그
    private String sauce = "핫소스";
    private String patty = "소세지";

    public KrustyDogs(){
    }

    public KrustyDogs(String bread, String vegetable, String cheese, String sauce, String patty) {
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
