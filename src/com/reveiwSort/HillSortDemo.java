package com.reveiwSort;

public class HillSortDemo {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 12, 30, 34, 9, 1 };
		int d = nums.length;

		while (d > 1) {
			d /= 2;

			for (int i = d; i < nums.length; i++) {
				int temp = nums[i];
				int j = i - d;
				while (j >= 0 && nums[j] > temp) {
					nums[j + d] = nums[j];
					j = j - d;
				}
				nums[j + d] = temp;
			}
		}

		System.out.println("排序后：");
		printSort(nums);

	}

	public static void printSort(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}
}
