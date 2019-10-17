package src;

import java.util.Scanner;

public class Swap_withDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first element");
		int first = sc.nextInt();
		System.out.println("enter second element");
		int sec = sc.nextInt();
		System.out.println("Enetered: first= "+first+"  second= "+sec);
		first = first + sec;
		sec = first - sec;
		first = first - sec;
		
		System.out.println("Swapped with difference: first= "+first+"  second= "+sec);

	}

}
