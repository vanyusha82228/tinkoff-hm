package edu.hm3.task6;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarketDo = new StockMarketDo();
        Stock appleStock = new Stock("Apple", 150.0);
        Stock googleStock = new Stock("Google", 250.0);
        Stock microsoftStock = new Stock("Microsoft", 180.0);

        stockMarketDo.add(appleStock);
        stockMarketDo.add(googleStock);
        stockMarketDo.add(microsoftStock);

        System.out.println(stockMarketDo.mostValuableStock());
        System.out.println(stockMarketDo);
        stockMarketDo.remove(microsoftStock);
        System.out.println();
        System.out.println(stockMarketDo);
    }
}
