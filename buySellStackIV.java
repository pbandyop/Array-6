// Time Complexity : O(N * K), if value of K < prices.length/2. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach


class Solution {
    public int maxProfit(int k, int[] prices) {

        if(prices == null || prices.length == 0) return 0;
        
        int maxProfit = 0;
        
        if(k >= prices.length/2){
          for(int i = 1; i < prices.length; i++){
            
            if(prices[i] > prices[i-1]){
                int profit = prices[i] - prices[i-1];
                maxProfit += profit;
            }
            
        }
        
        return maxProfit;  
        }
        
        
        int[] buyingPrice = new int[k+1];
        int[] profit = new int[k+1];
        
        Arrays.fill(buyingPrice, Integer.MAX_VALUE);

        
        for(int price: prices){
            
            for(int i = 1; i<=k; i++){
                buyingPrice[i] = Math.min(buyingPrice[i], price - profit[i-1]);
                profit[i] = Math.max(profit[i], price - buyingPrice[i]);
            }

        }
        
        return profit[k];
    }
}