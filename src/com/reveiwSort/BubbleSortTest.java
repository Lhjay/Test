package com.reveiwSort;

import java.util.Arrays;

public class BubbleSortTest {
public static void main(String[] args) {
	int[] arr = { 49, 38, 65, 97, 76, 1, 3, 2 ,90,5};
	for (int i = 0; i < arr.length -1 ; i++) {
		for (int j = 1; j < arr.length -i; j++) {
			if(arr[j-1] > arr[j]){
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	System.out.println(Arrays.toString(arr));
}
}
