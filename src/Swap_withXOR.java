package src;

import java.util.Scanner;

public class Swap_withXOR {

	/*
	 * swapping elements without using temp variable
	 * but using XOR 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first element");
		int first = sc.nextInt();
		System.out.println("enter second element");
		int sec = sc.nextInt();
		System.out.println("Enetered: first= "+first+"  second= "+sec);
		//use bitwise operator ^ for XOR operation
		//its used for swapping as its output is 1 for different bits,
		//so we can get original bits back with same operations again and again
		first = first ^ sec;	//first gets XOR (new) value, sec is sec value(orig)
		sec = first ^ sec;		//sec gets value of first as we did XOR on new value with sec orig value
		first = first ^ sec;	//first value gets value of sec as we did XOR of new value with first orig value
		
		System.out.println("Swapped with XOR: first= "+first+"  second= "+sec);

	}

}
