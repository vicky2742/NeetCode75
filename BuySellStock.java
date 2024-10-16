
public class BuySellStock {
    public static void buySellStock(int prices[]) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = Math.max(profit, prices[j] - prices[i]);
                } 
                
                else {
                    i = j;
                }
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        buySellStock(prices);
    }
}
