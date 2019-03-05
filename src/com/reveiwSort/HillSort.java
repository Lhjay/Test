package com.reveiwSort;

/**
 * 算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组， 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，
 * 然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。 当增量减到1时，进行直接插入排序后，排序完成。
 * 
 * @author L
 * 
 */
public class HillSort {
	public static void main(String[] args) {
		int[] nums = { 10, 30, 40, 50, 20, 18, 1 };
		int d = nums.length;
		int temp;

		System.out.println(Math.ceil(1.5));

		while (d > 1) {
			d /= 2;
			for (int i = d; i < nums.length; i++) {
				temp = nums[i];
				int j = i - d;
				while (j >= 0 && nums[j] > temp) {
					nums[j + d] = nums[j];
					j = j - d;
				}
				nums[j + d] = temp;
			}
		}
		System.out.print("\n" + "排序后：" + "\n");
		printSort(nums);
	}

	private static void printSort(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
