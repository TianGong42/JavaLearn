package nine;

public class Stock {

    String symbol;     //股票代码
    String name;       //股票名称
    double previousClosingPrice;  //存储前一天的股票值
    double currentPrice;          //存储当时的股票值

    Stock(String NewSymbol,String NewName){
        symbol = NewSymbol;
        name = NewName;
    }

    public double getChangePercent(){

        return Math.abs(previousClosingPrice - currentPrice) / currentPrice * 100;
    }
}
