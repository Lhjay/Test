package com.sortDemoTest;

/**
 * It's about Straight Insert Sort
 * @author L
 *
 */

public class StraightInsertSort {
	public static void main(String[] args) {
		int[] nums = {10,20,34,45,21,19};
		System.out.println("排序前：");
		for (int i = 0; i < nums.length; i++) {
			System.out.print( + nums[i]+" ");
			int j;
			int temp = nums[i];
			for (j = i - 1; j > 0; j--) {
				if (nums[j] > temp) {
					nums[j+1] = nums[j];
				}else {
					break;
				}
			}
			nums[j+1] = temp;
		}
		System.out.println();
		System.out.println("排序后:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			
		}
	}
}
