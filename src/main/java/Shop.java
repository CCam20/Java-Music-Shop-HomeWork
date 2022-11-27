import java.util.ArrayList;

public class Shop implements ISell{

    ISell iSell;

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }
    public int getStockLevels(){
        return stock.size();
    }

    public void addToStock(ISell iSell){
        stock.add(iSell);
    }
    public void removeFromStock(ISell iSell){
        stock.remove(iSell);
    }

//    public double calculateProfit() {
//        double total = 0;
//        for(double i = 0; i<stock.size();i++){
//
//        }
//    }

    @Override
    public double calculateMarkup() {
        double total = 0;
        for (int i=0; i <stock.size(); i++){
            total += stock.get(i).calculateMarkup();
        }
        return total;
    }
}
