package com.reveiwSort;

import java.util.Arrays;

public class FastSort {
	public static void main(String[] args) {
		int[] nums = { 10, 3, 40, 49, 12, 13 };
		fastSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	private static void fastSort(int[] nums, int start, int end) {
		if (start < end) {
			int mid = Partition(nums, start, end);
			fastSort(nums, start, mid - 1);
			fastSort(nums, mid + 1, end);
		}
	}

	// 返回中轴
	private static int Partition(int[] nums, int start, int end) {
		int tmp = nums[start];
		int left = start + 1;
		int right = end;
		while (left <= right) {
			while (left <= right && nums[left] <= tmp) {
				left += 1;
			}
			while (left <= right && nums[right] >= tmp) {
				right -= 1;
			}
			if (left <= right) {
				int tmp2 = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp2;
			} else {
				break;
			}
		}
		nums[start] = nums[right];
		nums[right] = tmp;
		return right;
	}
}
