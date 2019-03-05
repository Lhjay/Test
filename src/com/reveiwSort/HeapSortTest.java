package com.reveiwSort;

import java.util.Arrays;

public class HeapSortTest {
	public static void main(String[] args) {
		int[] nums = {10, 30, 49, 58, 28, 1};

		heapsort(nums);
	}

	public static void heapsort(int[] arr) {
		// 建堆
		for (int i = 0; i < arr.length - 1; i++) {
			buildHeap(arr, arr.length - 1 - i);
			swapHeap(arr, 0, arr.length - 1 - i);
			System.out.println(Arrays.toString(arr));
		}
//		System.out.println(Arrays.toString(arr));

	}

	private static void swapHeap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	private static void buildHeap(int[] arr, int lastIndex) {
		// 找父节点
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// k代表正在判断的点
			int k = i;
			// 如果当前父节点的子节点存在
			while ((2 * k + 1) <= lastIndex) {
				// k节点左节点的索引
				int bigIndex = 2 * k + 1;
				// 判断右节点存在
				if (bigIndex < lastIndex
						&& arr[bigIndex] < arr[bigIndex + 1]) {
					// bigIndex代表较大索引值
					bigIndex++;
				}

				// 如果k节点的值小于较大孩子节点的值的话，替换
				if (arr[k] < arr[bigIndex]) {
					swapHeap(arr, k, bigIndex);
					k = bigIndex;
				} else {
					break;
				}

			}
		}

	}
}
