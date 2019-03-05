package com.reveiwSort;

import java.util.Arrays;

public class StraightIsnertSort {
	public static void main(String[] args) {
		int[] nums = { 10, 30, 45, 50, 13, 4, 1};
		System.out.println("排序前：");
		printSort(nums);

		for (int i = 0; i < nums.length; i++) {
			int j;
			int temp = nums[i];
			for (j = i - 1; j >= 0; j--) {
				if (nums[j] > temp) {
					nums[j + 1] = nums[j];
				} else {
					break;
				}
			}
			nums[j + 1] = temp;
		}
		System.out.println("\n" + "排序后：");
		Arrays.sort(nums);
		printSort(nums);
	}
	
	
	
	public static void printSort(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
