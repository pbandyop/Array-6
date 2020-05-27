// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach
//keep track of minimum buying price and maximum profit for two transactions

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0) return 0;
        
        int buyingPrice1 = Integer.MAX_VALUE;
        int profit1 = 0;
        
        int buyingPrice2 = Integer.MAX_VALUE;
        int profit2 = 0;
        
        for(int price: prices){
            buyingPrice1 = Math.min(buyingPrice1, price);
            profit1 = Math.max(profit1, price - buyingPrice1);
            
            buyingPrice2 = Math.min(buyingPrice2, price - profit1);
            profit2 = Math.max(profit2, price - buyingPrice2);
        }
        
        return profit2;
    }
}