package com.algorithm;

public class sort {
	
	//冒泡排序
	public static void bubbleSort(int[] numbers) {
		int temp;
		int size = numbers.length;
		for (int i = 0; i< size - 1; i++) {
			for (int j = i+1; j < size; j++) {
				if(numbers[i] < numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
}
