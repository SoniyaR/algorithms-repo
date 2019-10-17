package src;

import java.util.Scanner;

public class Intersection_line {

	public static void main(String[] args) {
		System.out.println("Enter the co-ordinates of line 1:\nx1,y1, x2,y2");
		Scanner sc = new Scanner(System.in);
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float slope1 = (y2-y1)/(x2-x1);
		System.out.println("Enter the co-ordinates of line 2:\nx1,y1, x2,y2");
		float p1 = sc.nextFloat();
		float q1 = sc.nextFloat();
		float p2 = sc.nextFloat();
		float q2 = sc.nextFloat();
		float slope2 = (q2-q1)/(p2-p1);
		if(slope1 == slope2) {
			System.out.println("Lines are parallel");
		}
		else {
			float cons1= y1 - (slope1 * x1);
			float cons2= q1 - (slope2 * p1);
			float x = (cons2 - cons1)/(slope1 - slope2);
			float y = (slope1 * x) + cons1;
			System.out.println("Point of intersection is ("+x+","+y+")");
		}
	}

}
