package com.sortDemoTest;

public class directInsertSort {
	public static void main(String[] args) {
		int[] arr = {49,38,65,97,76,13,27,49,78,34,12,64,1};
        System.out.println("排序之前:");
        printArray(arr);
        for(int i = 0;i < arr.length;i++){
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j] > temp)
                    arr[j+1] = arr[j];
                else
                    break;
            }
            arr[j+1] = temp;
        }
        System.out.println(" ");
        System.out.println("排序之后:");
        printArray(arr);
	}
	
	private static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}
