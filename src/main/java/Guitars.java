public class Guitars extends Instruments{

    private double numberOfStrings;

    public Guitars(String type, String colour, String manufacturer, double numberOfStrings, double buyPrice, double sellPrice) {
        super(type, colour, manufacturer, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public String playInstrument() {
        return "Guitar Playing";
    }

    public double getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
