class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int price = Integer.MAX_VALUE;
        for(int priceOfDay : prices){
            price = Math.min(price , priceOfDay);
            maxProfit = Math.max(maxProfit , priceOfDay - price );
        }
        return maxProfit;
    }
}
