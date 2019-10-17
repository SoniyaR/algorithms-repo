package src;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str ="";
		String rev="";
		if(sc.hasNextLine()) {
			str= sc.nextLine();
		}
		if(!str.equals("") && str.length()!=0) {
			for(int i=str.length()-1; i>=0;i--) {
				rev = rev+String.valueOf(str.charAt(i));
			}
			System.out.println(rev);
		}
	}

}
