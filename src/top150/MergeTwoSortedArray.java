package top150;

import java.util.Arrays;

public class MergeTwoSortedArray {

	private static void merge(int[] arr1, int m, int[] arr2, int n) {
		int len1 = m;
		int len2 = n;
		
		for(int i=0;i<len2;i++) {
			arr1[len1] = arr2[i];
			len1++;
		}
		
		Arrays.sort(arr1);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
		merge(arr1 , 3, arr2,3);
		System.out.println(Arrays.toString(arr1));
	}

	
}
