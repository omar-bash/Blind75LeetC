package SecondQuestion;

import java.util.ArrayList;

public class BuyAndSellStock {
	public static int maxProfit(int[] prices) {
		int max_so_far=0;
		int min=prices[0];
		int max=0;
	//	ArrayList <Integer> newArr=new ArrayList<Integer> ();
		int size=prices.length;
		for(int i=0;i<size;i++) {
			max_so_far=prices[i]-min;
			if(max_so_far<0) {
				max_so_far=0;
			}
			if(prices[i]<min) {
				min=prices[i];
			}
			if(max_so_far>max) {
				max=max_so_far;
			}	
		}

		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices= {7,1,5,3,6,4};
		
		int finalNum=maxProfit(prices);
		System.out.println(finalNum);
	}

}
