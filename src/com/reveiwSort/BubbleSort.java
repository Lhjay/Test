package com.reveiwSort;

import java.util.Arrays;

/**
 * 在要排序的一组数中，对当前还未排好序的范围内的全部数， 自上而下对相邻的两个数依次进行比较和调整， 让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换
 * 
 * @author L
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 1, 3, 2 ,90};
		int arrLen = arr.length;

		for (int i = 0; i < arrLen-1; i++) {
			for (int j = 1; j < arrLen - i; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

		System.out.println(Arrays.toString(arr));

	}
}
