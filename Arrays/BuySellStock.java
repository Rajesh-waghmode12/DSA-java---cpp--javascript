

public class BuySellStock {

    public int buySellStock(int[] arr) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int price : arr) {
            if (minValue < price) {
                minValue = price;
            } else {
                maxProfit = Math.max(maxProfit, maxProfit - minValue);
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        

    }
}
