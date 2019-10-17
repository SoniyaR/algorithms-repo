package patterns;

public class OneToHundredPattern {
	
	/*
	 * using only one variable and one loop
	 */
	
	public static void main(String[] args) {
		int i=1;
		while(i <= 200) {
			if(i == 100) {
				recursiveMeth(1);
			}
			else if(i>100) {
				System.out.println(i + "  " + i);
			}
			else {
			System.out.println(i + "   " + (100-i+1));
			}
			
			i++;
		}
		
	}
	
	private static void recursiveMeth(int k) {
		if(k <= 100) {
			System.out.println(100 + "   " + k);
			k = k + 1;
			recursiveMeth(k);
		}
	}

}
