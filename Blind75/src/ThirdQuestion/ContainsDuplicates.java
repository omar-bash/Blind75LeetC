package ThirdQuestion;

import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        boolean isDup=false;
        HashSet <Integer> Weeder = new HashSet<Integer> ();
        for(int i=0;i<nums.length;i++) {
        	if(Weeder.contains(nums[i])) {
        		isDup=true;
        		return isDup;
        	}
        	Weeder.add(nums[i]);
        }
    	return isDup;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

}
