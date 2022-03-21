package SixthQuestion;

public class MaxProductSubarray {
	  public static int maxProduct(int[] nums) {
		  int largestProduct=1;
		  int maxProduct=-2000;
		  for(int i=0;i<nums.length;i++) {
			  largestProduct*=nums[i];
			  if(largestProduct>maxProduct) {
				  maxProduct=largestProduct;
			  }
			  if(largestProduct==0) {
				  largestProduct=1;
			  }
		  }
		  largestProduct=1;
		  for(int j=nums.length-1;j>=0;--j) {
			  largestProduct*=nums[j];
			  if(largestProduct>maxProduct) {
				  maxProduct=largestProduct;
			  }
			  if(largestProduct==0) {
				  largestProduct=1;
			  }
			
		  }
//		  System.out.println("Largest: " + largestProduct);
//		  System.out.println("Maximum: " + maxProduct);
	      return maxProduct;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,-2,4};
		int product=maxProduct(nums);
		int nums1[]= {3,-1,4};
		int product2=maxProduct(nums1);
		System.out.println("Product 1: " + product);
		System.out.println("Product 2: " + product2);
	}

}
