public abstract class Instruments implements IPLay, ISell {

private String type;
private String colour;
private String manufacturer;
private double buyPrice;
private double sellPrice;

public Instruments(String type, String colour, String manufacturer, double buyPrice, double sellPrice){
    this.type = type;
    this.colour = colour;
    this.manufacturer = manufacturer;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
