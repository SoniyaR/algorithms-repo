package src;

import java.util.Scanner;

public class Count2s_inNnumbers {

	public static void main(String[] args) {
		System.out.println("Enter number of integers:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			int m=i;
			while(m > 0) {
				if(m % 10 == 2)
					count += 1;
				m = m/10;
			}
		}
		System.out.println("count of 2s: "+count);
	}

}
