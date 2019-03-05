package com.reveiwSort;

import java.util.Arrays;

public class HeapSortExercise {
	public static void main(String[] args) {
		int[] nums = { 10, 30, 49, 58, 28, 1 };

		heapSort(nums);
	}

	private static void heapSort(int[] nums) {
		int numsLen = nums.length;
		// 1.循坏建堆
		for (int i = 0; i < numsLen - 1; i++) {
			buildHeap(nums, numsLen - 1 - i);
			// 交换堆的首尾
			swapHeap(nums, 0, numsLen - i - 1);
			System.out.println(Arrays.toString(nums));
		}
	}

	private static void swapHeap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void buildHeap(int[] nums, int lastIndex) {
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// k是记录当前位置
			int k = i;

			// 判断是否有左孩子节点
			while(2 * k + 1 <= lastIndex) {
				// 记录左孩子节点
				int bigIndex = 2 * k + 1;
				//判断右节点存在，并比较左右节点大小
				if (bigIndex  < lastIndex
						&& nums[bigIndex ] < nums[bigIndex+1]) {
					//记录较大索引位置
					bigIndex ++;
				}
				
				//判断父节点与较大孩子节点大小
				if(nums[k] < nums[bigIndex]){
					swapHeap(nums, k, bigIndex);
					k = bigIndex;
				}else{
					break;
				}
			}
		}

	}
}
