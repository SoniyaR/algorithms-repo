package sorting;

import java.util.Arrays;

import sorting.InputforAll;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = { 4, 7, 8, 5, 2, 0, 6, 3, 1, 9};
		sort(arr);
	}
	
	public static void sort(int[] arr) {
		divide(arr);
	}

	private static void divide(int[] arr) {
		
		for(int a:arr) {
			System.out.println(a);
			}
		System.out.println("-------");
		
		if(arr.length == 1)
			return;
		
		int center = arr.length/2;
		int[] arr1=new int[arr.length/2];

		for(int i = 0; i < center; i++) {
			arr1[i] = arr[i];
		}
		int[] arr2=new int[arr.length/2 + (arr.length % 2)];
		for(int j = center; j < arr.length; j++) {
			arr2[j-center] = arr[j];
		}
		
		divide(arr1);
		divide(arr2);
		
		merge(arr1, arr2, arr);
	}

	private static void merge(int[] arr1, int[] arr2, int[] arr) {
		System.out.println("inside merge for arr1 and arr2");
		int i=0;
		int j=0;
		int k=0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}else if(arr1[i] == arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k = k +1;
				arr[k] = arr2[j];
				j++;
				
			}
			else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < arr1.length) {
			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {
			arr[k] = arr2[j];
			k++;
			j++;
		}
		
		System.out.println("Merged:");
		for(int a:arr) {
			System.out.println(a);
			}
		System.out.println("--------------");
	}
	
}
