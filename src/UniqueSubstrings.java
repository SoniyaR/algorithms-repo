package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubstrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Set<String> strSet = new HashSet<>();
		
		for(int i=0; i < str.length(); i++)	{
			
			strSet.add(String.valueOf(str.charAt(i)));
			
			for(int j = i+1; j < str.length(); j++) {
				
				strSet.add(str.substring(i, j+1));
				
			}
		}
		
		for(String s: strSet) {
			System.out.println(s);
		}
		

	}

}
