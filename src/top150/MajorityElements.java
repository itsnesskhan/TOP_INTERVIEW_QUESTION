package top150;

import java.util.Arrays;

public class MajorityElements {

	 public static int majorityElement(int[] nums) {
	   int count =0;
	   int n = nums.length;
	   Arrays.sort(nums);
	   for(int i=0;i<nums.length;i++) {
		   if(nums[i]==nums[i+1]) {
			   count++;
			   if(count>=n/2) {
				   return nums[i];
			   }
		   }
		   
	   }
	   
	   return -1;
	 }
	 
	 
	 public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}
}
