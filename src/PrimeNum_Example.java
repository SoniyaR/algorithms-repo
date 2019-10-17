package src;

import java.util.Scanner;

public class PrimeNum_Example {

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		if(num < 0) {
			System.out.println("Enter valid positive number");
		}
		else if(isPrime(num)) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}

	}
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1)
			return false;
		if(num == 2 || num == 3)
			return true;
		if(num % 2 == 0)
			return false;
		int sqrrt = (int)Math.sqrt(num) + 1;
		for(int i = 3; i < sqrrt; i += 2) {
			if(num % i ==0)
				return false;
		}
		return true;
	}

}
