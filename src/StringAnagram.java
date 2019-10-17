package src;

import java.util.HashMap;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		System.out.println("Enter first string\n");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine().trim();
	
		System.out.println("Enter second string\n");
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc2.nextLine().trim();
//		System.out.println(str1+str2);
		
		if(str1.length() != str2.length()) {
			System.out.println("Not anagram of each other");
		}
		else {
			HashMap<Character, Integer> hm1 = new HashMap<>();
			HashMap<Character, Integer> hm2 = new HashMap<>();
			
			for(char ch: str1.toCharArray()) {
				if(hm1.get(ch) == null) {
					hm1.put(ch, 1);
				}
				else {
					int temp = hm1.get(ch);
					hm1.put(ch, temp+1);
				}
			}
			
			for(char ch: str2.toCharArray()) {
				if(hm2.get(ch) == null) {
					hm2.put(ch, 1);
				}
				else {
					int temp = hm2.get(ch);
					hm2.put(ch, temp+1);
				}
			}
			
			System.out.println(hm1.entrySet());
			
			if(hm1.entrySet().equals(hm2.entrySet())) {
				System.out.println(str1 + " and " + str2 + " are Anagram of each other");
			}
			
		}

	}

}
