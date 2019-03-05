package com.sortDemoTest;

public class InsertSort_binarySearch {
	    public static void main(String[] args){
	        int[] arr = {49,38,65,97,76,13,27,49,78,34,12,64,1};
	        System.out.println("排序之前:");
	        printArray(arr);
	        sort(arr);
	        System.out.println(" ");
	        System.out.println("排序之后:");
	        printArray(arr);
	    }

	    private static void sort(int[] arr){
	        for(int i = 1;i < arr.length;i++){
	            int temp = arr[i];
	            int left = 0;
	            int right = i - 1;
	            int mid;
	            while(left <= right){
	                mid = (right - left) / 2 + left;
	                if (arr[mid] > temp)
	                    right = mid - 1;
	                else
	                    left = mid + 1;
	            }
	            for(int j=i-1;j>=left;j--){
	                arr[j+1] = arr[j];
	            }
	            arr[left] = temp;
	        }
	    }
	    private static void printArray(int[] arr){
	        for(int x:arr){
	            System.out.print(x + " ");
	        }
	    }

}
