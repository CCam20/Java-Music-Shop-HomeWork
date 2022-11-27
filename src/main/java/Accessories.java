public class Accessories implements ISell {

    private String type;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessories(String type, String description, double buyPrice, double sellPrice){
        this.type = type;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}

