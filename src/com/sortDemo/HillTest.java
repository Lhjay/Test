package com.sortDemo;

public class HillTest {
	public static void main(String[] args) {
		int a[] = { 1, 3, 98, 65, 20, 48, 34};
		double len = a.length;
		int tmp = 0;
		
		while (true) {
			len = Math.ceil(len / 2);
			int line = (int) len;
			for (int i = 0; i < line; i++) {
				for (int j = i + line; j < a.length; j += line) {
					int k = j - line;
					tmp = a[j];

					for (; k >= 0 && tmp < a[k]; k -= line) {
						a[k + line] = a[k];
					}
					a[k + line] = tmp;
				}
			}
			if(line == 1){
				break;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
