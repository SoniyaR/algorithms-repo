package src;

public class TestString {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1 + " " + s2 + " " + (s1==s2));
		
		StringBuffer b1 = new StringBuffer("abc");
		StringBuffer b2 = b1;
		b1.append("d");
		System.out.println(b1 + " " + b2 + " " + (b1==b2));

	}

}
