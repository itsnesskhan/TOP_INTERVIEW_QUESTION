package top150;

import java.util.Arrays;

public class MergeTwoSortedArray {

	private static void merge(int[] arr1, int[] arr2) {
		int len1 = 0;
		
		for(int i=0;i<arr2.length;i++) {
			arr1[len1] = arr2[i];
			len1++;
		}
		
		Arrays.sort(arr1);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
		merge(arr1 ,arr2);
		System.out.println(Arrays.toString(arr1));
	}

	
}
