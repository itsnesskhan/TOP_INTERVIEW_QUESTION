package top150.twopointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left<right){

            if (numbers[left]+numbers[right]==target){
                ans[0] = ++left;
                ans[1] = ++right;
                return ans;
            } else if (numbers[left]+numbers[right]<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
