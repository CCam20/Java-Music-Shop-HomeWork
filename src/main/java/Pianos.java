public class Pianos extends Instruments{


    public Pianos(String type, String colour, String manufacturer, double buyPrice, double sellPrice) {
        super(type, colour, manufacturer, buyPrice, sellPrice);
    }

    @Override
    public String playInstrument() {
        return "Piano Playing";
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
