package top150;

import java.util.Arrays;

public class MaxProfitBuySellStock {
	
	  public static int maxProfit(int[] prices) {
		  int max = prices[prices.length-1];
	        int[] maxPro = new int[prices.length];
	        int n= prices.length-1;
	        for(int i=prices.length-1;i>=0;i--){
	            if(max>prices[i]) {
	            	maxPro[n--] = max;	            	
	            }
	            else {
	            	max = prices[i];
	            	maxPro[n--] = max;
	            }
	        }
	        System.out.println(Arrays.toString(maxPro));
	        int maxProfilt =0;
	        for(int i=0;i<prices.length;i++) {
	        	maxProfilt = Math.max(maxProfilt, maxPro[i]-prices[i] );
	        }
	        return maxProfilt;
	    }
	
	public static void main(String[] args) {
		int profits[] = {7,1,5,3,6,4};
		System.out.println("MAX PROFIT : "+maxProfit(profits));
	}

}
