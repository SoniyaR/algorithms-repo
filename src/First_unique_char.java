package src;

public class First_unique_char {
	
	/**
	 * we need to find the first character in the string which does not repeat
	 */

	public static void main(String[] args) {
		String str = "ababcde";
		String temp = "";
		char chr = 0;
		for(int i=0; i<str.length(); i++) {
			char ichar = str.charAt(i);
			if(i == str.length()-1 && !temp.contains(String.valueOf(ichar))) {
				chr = str.charAt(i);
				break;
			}
			String substr = str.substring(i+1, str.length());
			if(substr.contains(String.valueOf(ichar))) {
				temp = temp + String.valueOf(ichar);
			}
			else if(!temp.contains(String.valueOf(ichar))){
				chr = str.charAt(i);
				break;
			}
		}
		if(chr == 0) {
			System.out.println("String does not have unique character");
		}
		else {
			System.out.println("first character which does not repeat is "+ chr);
		}
		
		//using java functions last index and first index of
//		for(int i=0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			int lastIndex = str.lastIndexOf(ch);
//			int firstIndex = str.indexOf(ch);
//			if(lastIndex == firstIndex) {
//				System.out.println("first unique char " + ch + " at index "+ lastIndex);
//				break;
//			}
//		}
	}

}
