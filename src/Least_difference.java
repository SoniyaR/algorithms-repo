package src;

import sorting.QuickSort;

public class Least_difference {

	public static void main(String[] args) {
		int[] arr1= {1, 3, 15, 10, 2};
		int[] arr2= {25, 127, 235, 19, 8};
		new QuickSort().sort(arr1, 0, arr1.length-1);
		QuickSort.sort(arr2, 0, arr2.length-1);
		int diff=Math.abs(arr1[0]-arr2[0]);
		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j < arr2.length; j++) {
				
				int locdiff=Math.abs(arr1[i] - arr2[j]);
				if(diff > locdiff) {
					diff = locdiff;
				}
				if(arr2[j] > arr1[i]) {
					break;
				}
			}
		}
		System.out.println(diff);
	}

}
