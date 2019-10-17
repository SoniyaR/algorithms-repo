package src;

import java.util.Scanner;

public class Sort_remDuplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÿou entered: "+sc.nextLine());
		
		String sorted = sort(sc.nextLine());

	}
	
	public static String sort(String line) {
		
		String sorted = "" ;
		
		sorted = mergesort(line);
		
		return sorted;
	}

	private static String mergesort(String line) {
		
		//sorting logic
		
		
		return line;
	}

}
