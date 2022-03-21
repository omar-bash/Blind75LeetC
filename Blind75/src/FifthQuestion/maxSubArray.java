package FifthQuestion;

public class maxSubArray {
	public static int maxSubArray(int[] nums) {
		int maxNow=0;
		int max=0;
		int single=nums[0];
		if(nums.length==1) {
			return single;
		}
		for(int i=0;i<nums.length;i++) {
			if(single<nums[i]) {
				single=nums[i];
			}
			if(nums[i]<0) {
				max=single;
			}
		}
		for(int i=0;i<nums.length;i++) {
			maxNow=nums[i]+maxNow;
			if(max<maxNow) {
				max=maxNow;
			}
			if(maxNow<0) {
				maxNow=0;
			}
			
		}
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1 [] = {-2,1,-3,4,-1,2,1,-5,-4};
		int ans1=maxSubArray(nums1);
		int [] nums2= {1};
		int ans2=maxSubArray(nums2);
		int  [] nums3= {5,4,-1,7,8};
		int ans3=maxSubArray(nums3);
		int nums4[]= {-1};
		int ans4=maxSubArray(nums4);
		int nums5[]= {-2,-1};
		int ans5=maxSubArray(nums5);
		System.out.println("Answer 1: " + ans1);
		System.out.println("Answer 2: " + ans2);
		System.out.println("Answer 3: " + ans3);
		System.out.println("Answer 4: " + ans4);
		System.out.println("Answer 5: " + ans5);
	}
}
