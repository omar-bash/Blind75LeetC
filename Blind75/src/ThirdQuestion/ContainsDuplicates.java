package ThirdQuestion;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        boolean isDup=false;
        for(int i=0;i<nums.length;i++) {
        	for(int j=1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			isDup=true;
        			return isDup;
        		}
        	}
        }
    	return isDup;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

}
