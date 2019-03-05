package com.reveiwSort;

import java.util.Arrays;

public class QuickSortDemo {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 97, 98, 3 ,10,30};
		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start < end){
			int mid = parpatition(arr,start,end);
			quickSort(arr, start, mid-1);
			quickSort(arr, mid+1, end);
		}
	}

	private static int parpatition(int[] arr, int start, int end) {
		int tmp = arr[start];
		int left = start + 1;
		int right = end;
		while(left <= right){
			while(left <= right && arr[left] <= tmp ){
				left += 1;
			}
			while(left <= right && arr[right] >= tmp ){
				right -= 1;
			}
			
			if (left <= right) {
				int tmp2 = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp2;
			}else{
				break;
			}
		}
		arr[start] = arr[right];
		arr[right]= tmp;
		return right;
	}
}
