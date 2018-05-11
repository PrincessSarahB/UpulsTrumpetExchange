package shop;

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
}
