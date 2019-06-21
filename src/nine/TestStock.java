package nine;

public class TestStock {

    public static void main(String[] args){
        Stock StockOne = new Stock("ORCL","Oracle Corporation");
        StockOne.previousClosingPrice = 34.5;
        StockOne.currentPrice = 34.35;
        System.out.printf("市值变化百分比%f%%",StockOne.getChangePercent());
    }
}
