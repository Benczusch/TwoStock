package stocks;

import java.util.List;

public class opportunity{
	public int buyTime;
    public int sellTime;
    public int profit;
    public Boolean firstStock
    
    public opportunity(int buyTime, int sellTime, Boolean firstStock,
                       List<Integer> firstStockPrices, List<Integer> secondStockPrices){
    	this.buyTime = buyTime;
        this.sellTime = sellTime;
        this.firstStock = firstStock;
        
        if (firstStock)
            this.profit = firstStockPrices[sellTime] - firstStockPrices[buyTime];
		else
            this.profit = secondStockPrices[sellTime] - secondStockPrices[buyTime];
    }
}

public class TwoStocks {
    public int calculateProfit(List<Integer> firstStockPrices, List<Integer> secondStockPrices) {
    	List<opportunity> Opportunities = new ArrayList<opportunity>();
    }
}

