package com.sortDemo;

 public class InsertDemo1{
	public static void main(String[] args) {
		
		int a[] = { 49, 38, 65, 97, 36, 2, 3, 1};
		
		int temp = 0;
		
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			
			temp = a[i];
			while(j>= 0 && temp < a[j]){
				a[j+1] = a[j];
				j -= 1;
			}
			a[j+1] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(","+a[i]);
		}
	}	
}