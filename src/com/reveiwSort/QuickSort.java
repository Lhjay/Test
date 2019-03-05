package com.reveiwSort;

import java.util.Arrays;

/**
 * 
 * 选择一个基准元素,通常选择第一个元素或者最后一个元素, 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,
 * 一部分大于等于基准元素,此时基准元素在其排好序后的正确位置, 然后再用同样的方法递归地排序划分的两部分
 * 
 * @author L
 * 
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64 };

		quickSort(arr, 0, arr.length - 1);
		System.err.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = partition(arr, start, end);
			quickSort(arr, start, mid - 1);
			quickSort(arr, mid + 1, end);
		}
	}

	// 返回中轴的位置
	private static int partition(int[] arr, int start, int end) {
		int temp = arr[start];
		int left = start + 1;
		int right = end;
		while (left <= right) {
			while (left <= right && arr[left] <= temp) {
				left += 1;
			}
			while (left <= right && arr[right] >= temp) {
				right -= 1;
			}
			if (left <= right) {
				int temp2 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp2;
			} else {
				break;
			}
		}
		arr[start] = arr[right];
		arr[right] = temp;
		return right;
	}
}
