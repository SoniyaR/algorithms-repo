package src;

import java.util.Scanner;

public class Fibonacci_EvenOnly {

	public static void main(String[] args) {
		System.out.println("enter the count of numbers in the series: ");
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		long[] arr = new long[count];
		arr[0]=1;
		arr[1]=1;
		for(int i = 2; i < count; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		for(long j:arr) {
			if(j%2==0)
			System.out.println(j);
		}
	}

}
