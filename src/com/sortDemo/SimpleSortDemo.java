package com.sortDemo;

/**
 * 
 * @author L
 *  简单排序
 *  在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 *         然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * 
 */
public class SimpleSortDemo {
	public static void main(String[] args) {
		int a[] = {1,54,6,3,78,34,12,45};
		
		int position = 0;
		
		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			position = i;
			
			int tmp = a[i];
			for (; j < a.length; j++) {
				if(a[j] < tmp){
					tmp = a[j];
					position = j;	
			}
		}
		a[position] = a[i];
		a[i] = tmp;
	}
	
	 for(int i=0;i<a.length;i++){
		 System.out.print("_"+a[i]);  
	 }
	}
}
