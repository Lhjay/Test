package com.sortDemo;

public class HillDemotest {
	public static void main(String[] args) {
		int a[] = {78, 25, 35, 23, 2, 3, 1};
		double len1 = a.length;
		
		while(true){
			len1 = Math.ceil(len1/2);
			int len = (int)len1;
			
			for (int i = 0; i < len; i++) {
				for (int j = i+len; j < a.length; j += len) {
					int k = j - len;
					int temp = a[j];
					
					while(k >= 0 && temp < a[k]){
						a[k+len] = a[k];
						k -= len;
					}
					a[k+len] = temp;
				}
			}
			
			if (len == 1) {
				break;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(","+a[i]);
		}
	}
}
