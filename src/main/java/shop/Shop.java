package shop;

import instruments.Instrument;
import interfaces.Sellable;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }

    public void addStock(Sellable item) {
        this.stock.add(item);
    }

    public void removeStock(Sellable item) {
        this.stock.remove(item);
    }


    public double calculateTotalProfit() {
        double total = 0;
        for(Sellable item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
