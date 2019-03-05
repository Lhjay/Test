package com.reveiwSort;

/**
 * 在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排
        好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的。
        如此反复循环，直到全部排好顺序
 * 
 * @author L
 *
 */
public class DirectInsertSort {
	public static void main(String[] args) {
		int[] nums = { 10, 39, 48, 34, 20, 3 };

		System.out.println("排序前：");
		/*for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}*/
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
		/*for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}*/
		printSort(nums);

	}

	/**
	 * @param arr
	 */
	public static void printSort(int[] arr) {
		/*for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}*/
		for (int x : arr) {
			System.out.print(x + " " );
		}
	}

}
