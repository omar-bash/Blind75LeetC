package FirstQuestion;

public class BruteForceTwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int [] arr= {-1,-1};
        int firstNum=0;
        int secondNum=0;
        for(int i=0;i<nums.length;i++) {
        	firstNum=nums[i];
        	secondNum=target-firstNum;
        	for(int j=0;j<nums.length;j++) {
        		if(secondNum==nums[j]) {
        			arr[0]=firstNum;
        			arr[1]=secondNum;
        			return arr;
        		}
        	}
        }
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1={2,7,11,15};
		int [] nums2= {3,2,4};
		int [] nums3= {3,3};
		int target=9;
		int target2=6;
		int [] ans1= new int [2];
		int [] ans2= new int [2];
		int [] ans3= new int [2];
		ans1=twoSum(nums1,target);
		ans2=twoSum(nums2,target2);
		ans3=twoSum(nums3,target2);
		System.out.println("First Output");
		System.out.println("--------------");
		for(int i=0;i<ans1.length;i++) {
			System.out.println(ans1[i]);
		}
		System.out.println("Second Output");
		System.out.println("-----------------------");
		for(int i=0;i<ans2.length;i++) {
			System.out.println(ans2[i]);
		}
		System.out.println("Third Output");
		System.out.println("-----------------");
		for(int i=0;i<ans3.length;i++) {
			System.out.println(ans3[i]);
		}
	
	}

}
