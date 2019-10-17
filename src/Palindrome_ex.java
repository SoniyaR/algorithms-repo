package src;

import java.util.Scanner;

public class Palindrome_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean isPali = true;
		int size=input.length();
		//max= (size%2 == 1 )? size+1:size;
		
//		for(int i = 0; i <= size-1; i++) {
//			if(input.charAt(i) != input.charAt(size-i-1)) {
//				isPali = false;
//				System.out.println("it is not a palindrome...");
//				break;
//			}
//		}
		
		for(int i = 0; i < ((size/2) -1) ; i++) {
			if(input.charAt(i) != input.charAt(size-i-1)) {
				isPali=false;
				break;
			}
		}
		
		if(isPali) {
			System.out.println("it is a palindrome...");
		}else {
			System.out.println("it is not a palindrome...");
		}

	}

}
