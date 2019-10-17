package src;

import java.util.HashMap;

public class CubeProblem {

	public static void main(String[] args) {
		int n= 100;
		int result;
		HashMap hm = new HashMap();
		for(int c = 1; c <= n; c++) {
			for(int d = 1; d <= n; d++) {
				result = (int) (Math.pow(c, 3) + Math.pow(d, 3));
				hm.put(result, String.valueOf(c)+","+String.valueOf(d));
			}
		}
		
		for(int a = 1; a <=n ; a++) {
			for(int b=a; b<=n; b++) {
				result = (int) (Math.pow(a, 3) + Math.pow(b, 3));
				String str = (String) hm.get(result);
				int cVal = Integer.valueOf(str.split(",")[0]);
				int dVal = Integer.valueOf(str.split(",")[1]);
				if(a!=cVal && b!=cVal && a!=dVal && b!=dVal) {
				System.out.println(a + ","+ b + "  " + cVal + "," + dVal);
				}
			}
		}

	}

}
