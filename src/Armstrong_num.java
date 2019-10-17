package src;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String ip="";
		int sum=0,ipnum=0;
		char c;
		if(sc.hasNextLine()) {
			ip=sc.nextLine();
			ipnum=Integer.valueOf(ip);
		}
		if(!ip.equals("") && ip.length()!=0) {
			int cube=0;
			int n=0;
			for(int i=0; i<ip.length();i++) {
				c = ip.charAt(i);
				n = (int)(c-'0');
				cube = n*n*n;
				sum= sum+cube;
			}
			if(ipnum == sum) {
				System.out.println("it is armstrong number :)");
			}
			else {
				System.out.println("not armstrong number");
			}
			//char ch =ip.charAt(0);
			//System.out.println(ch+" "+(int)(ch-'0'));
		}
	}

}
