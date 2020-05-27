// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach
//keep track of minimum buying price and maximum profit

class Solution {
    public int maxProfit(int[] prices) {
       if(prices == null || prices.length == 0) return 0;
        
        int buyingPrice = Integer.MAX_VALUE; //minimize buying price
        int profit = 0; //maximze profit
        
        for(int price: prices){
            buyingPrice = Math.min(buyingPrice, price);
            profit = Math.max(profit, price - buyingPrice);
        }
        return profit; 
    }
}