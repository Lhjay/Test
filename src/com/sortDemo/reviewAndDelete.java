package com.sortDemo;

public class reviewAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 30, 40, 29, 15 };

		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = i -1;
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print("_" + a[i]);
		}
	}

}
