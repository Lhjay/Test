package com.reveiwSort;

/**
 * 直接选择排序，最小的与第一个交换，次小的与第二个交换，以此类推，循环至结束
 * 
 * @author L
 * 
 */
public class DirectSelectSort {
	public static void main(String[] args) {
		int[] nums = { 10, 30, 4, 20, 49, 59, 34, 138, 1, 12, 13 };
		for (int i = 0; i < nums.length; i++) {
			int min = i;
			boolean flag = true;
			int j;
			for (j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
					flag = false;
				}
			}
			if (flag) {
				break;
			} else {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
			}
		}
		System.out.println("排序前：");
		printSort(nums);
	}

	public static void printSort(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
