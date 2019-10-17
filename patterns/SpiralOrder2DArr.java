package patterns;

import java.util.ArrayList;

public class SpiralOrder2DArr {

	public static void main(String[] args) {
		int nrows=0;
		int ncols=0;
		int numbers=0;
		int dir=0;

		int[][] arr = new int[][] {
			{2,4,6,8},
			{5,9,12,16},
			{2,11,5,9},
			{3,2,1,8}
		};

		nrows = arr.length;	//total rows
		ncols = arr[0].length;	//total columns
		dir = 0;	//dir-> 0 right, 1 down, 2 left, 3 up

		for(int i=0; i < arr.length; i++) {
			numbers += arr[i].length;
		}

		int t=0;	//top row
		int b=nrows-1;	//bottom row
		int l=0;	//left column
		int r=ncols-1;	//right column
		
		ArrayList<Integer> result = new ArrayList<>();

		while(t <= b && l <= r) {

			switch(dir) {
			case 0:
				
				for(int i = l; i <= r; i++) {
					result.add(arr[t][i]);
				}
				t++;

				break;

			case 1:
				
				for(int i = t; i <= b; i++) {
					result.add(arr[i][r]);
				}
				r--;

				break;

			case 2:
				
				for(int i = r; i >= l; i--)	{
					result.add(arr[b][i]);
				}
				b--;

				break;

			case 3:
				
				for(int i = b; i >= t; i--) {
					result.add(arr[i][l]);
				}
				l++;

				break;

			default:

				break;
			}

			dir = (dir+1) % 4;
		}
		
		System.out.println("Result : " + result);

	}

}
