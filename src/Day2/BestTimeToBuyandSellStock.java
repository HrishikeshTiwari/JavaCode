package Day2;

public class BestTimeToBuyandSellStock {

	public static void main(String[] args) {


		/*
		 * Problem: Best Time to Buy and Sell Stock
          You are given an array prices where prices[i] represents the stock price on day i.
          You want to maximize your profit by choosing a single day to buy and a later day to sell.
           Return the maximum profit you can achieve.
           If no profit is possible, return 0.

           Input: prices = [7, 1, 5, 3, 6, 4]  
Output: 5  
Explanation:  
Buy at price = 1 (day 2), sell at price = 6 (day 5), profit = 6 - 1 = 5.

          Input: prices = [7, 6, 4, 3, 1]  
          Output: 0  
          Explanation:  
          No profit is possible since prices only decrease.
          
          
          Algorithm (Step-by-Step Approach)
Initialize minPrice = Integer.MAX_VALUE (to track the lowest price).
Initialize maxProfit = 0 (to store the maximum profit).
Loop through the prices array:
Update minPrice if the current price is lower.
Calculate profit (current price - minPrice).
Update maxProfit if the new profit is greater than the previous one.
Return maxProfit at the end.


		 */

		int arr[]= {7,1,5,3,6,4};
		int minprice=Integer.MAX_VALUE;
		int maxprofit=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<minprice) {
				minprice=arr[i];
			}
			int currentprice=arr[i];
			
			maxprofit=Math.max(maxprofit,currentprice-minprice);
		}
		
		System.out.println(maxprofit);


	}

}
