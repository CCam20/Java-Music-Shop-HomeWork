public class Drums extends Instruments {

    private double numberOfDrums;
    private double numberOfSymbols;

    public Drums(String type, String colour, String manufacturer, double numberOfDrums, double numberOfSymbols, double buyPrice, double sellPrice) {
        super(type, colour, manufacturer, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
        this.numberOfSymbols = numberOfSymbols;
    }


    @Override
    public String playInstrument() {
        return "Drums Playing";
    }

    public double getNumberOfDrums() {
        return numberOfDrums;
    }

    public double getNumberOfSymbols() {
        return numberOfSymbols;
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
