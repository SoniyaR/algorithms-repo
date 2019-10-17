package sorting;

import java.util.Random;

public class InputforAll {
	
	public InputforAll() {
		
	}
	
	private static char randomAlphabet() {
		Random r = new Random() ;
		char c = 'a';
		int i= r.nextInt(25) + 'a' ;
		//System.out.println((char) i);
		return ((char) i);
	}
	
	public static char[] getCharArray(int size) {
		
		char[] newArr = new char[size];
		
		for(int i = 0; i < size; i++)
			newArr[i] = randomAlphabet();
		
		return newArr;
		
	}
	
	public static int[] getNumbersArray(int size ) {
		int[] arr = new int[size];
		Random r = new Random();
		for(int k = 0; k <size; k++) {
			arr[k] = r.nextInt(50);
		}
		
		return arr;
		
	}
	
	public static String getString(int length) {
		
		String str = "";
		int count = 0;
		while(count != length) {
			str = str+randomAlphabet();
			count++;
		}
		
		return str;
	}
	
	public void getNumberSortedArray() {
		
	}
	
	public void getStringSortedArray() {
		
	}
	
	public static void main(String[] args) {
		
		char[] arr = getCharArray(5);
		for(char c:arr) {
			System.out.println(c);
		}
		
		System.out.println(getString(6));
		System.out.println(getNumbersArray(7));
	}

}
