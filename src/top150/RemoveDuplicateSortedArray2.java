package top150;

import java.util.Arrays;

public class RemoveDuplicateSortedArray2 {
	
//     remove duplicate but constraint is keep only two duplicates
	 public static int removeDuplicates(int[] nums) {
		   int j = 1;
		   for (int i = 1; i < nums.length; i++) {
		       if(j==1 || nums[i]!=nums[j-2]) {
		    	   nums[j++] = nums[i];
		       }
		    }		  
		   return j;
		    }
	
	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Array with duplicates : "+Arrays.toString(nums));
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
}
