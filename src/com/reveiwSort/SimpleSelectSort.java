package com.reveiwSort;

/**
 * 要排序的一组数中，选出最小的一个数与第一个位置的数交换； 然后在剩下的数当中再找最小的与第二个位置的数交换， 如此循环到倒数第二个数和最后一个数比较为止
 * 
 * @author L
 * 
 */
public class SimpleSelectSort {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前:");
		printArray(arr);
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			int j;
			int min = i;
			for (j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]){
					min = j;
					flag = false;
				}
			}
			if(flag){
				break;
			}else{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		System.out.println("\n" + "排序后：");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
