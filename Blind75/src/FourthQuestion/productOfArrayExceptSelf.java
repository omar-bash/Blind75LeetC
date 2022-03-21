package FourthQuestion;

public class productOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
		int [] answer=new int[nums.length];
		int [] after=new int [nums.length];// after index;
		int [] before=new int[nums.length];// before index;
		int size=nums.length;
		before[0]=1;
		after[size-1]=1;
		if(size==0) {
			return nums;
		}
		for(int i=1;i<size;i++) {
			before[i]=nums[i-1]*before[i-1];
		}
		for(int j=size-2;j>=0;j--) {
			after[j]=nums[j+1]*after[j+1];
		}
		for(int k=0;k<size;k++) {
			answer[k]=before[k]*after[k];
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		int [] nums= {1,2,3,4};
		int [] ans=productExceptSelf(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}
