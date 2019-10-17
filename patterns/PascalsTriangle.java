package patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		
		PrintPascalTriangle(height);

	}

	private static void PrintPascalTriangle(int height) {
		
		ArrayList<Integer> currArr = new ArrayList<>();
		ArrayList<Integer> prevArr = new ArrayList<>();
		int count = 1;
		String spaceStr = "";
		while(count != height+1) {
			
			currArr.clear();
			spaceStr="";
			
			//printing space logic for triangle shape
			int space = (height-count) + (height-count)/2;
			for(int s = 0; s <= space; s++)
				spaceStr += " ";
			
			//checking count and printing elements by traversing through prevArr for serial additions, adding new numbers to currArr
			if(count == 1)	{
				currArr.add(1);
				System.out.print(spaceStr + 1 + "\n");
			}
			else {
				System.out.print(spaceStr);
				for(int i = 0; i < prevArr.size(); i++)	{
					
					if(i==0)	{
						currArr.add(1);
						System.out.print(1);
					}
					if(i==prevArr.size()-1){
						currArr.add(1);
						System.out.print(" * " + 1 + "\n");
					}
					if(i >= 0 && i < prevArr.size()-1) {
						currArr.add(prevArr.get(i) + prevArr.get(i+1));
						System.out.print(" * " + (prevArr.get(i) + prevArr.get(i+1)));
					}
				}
				
			}
//			for(int s = 0; s <= space; s++)
//			System.out.print(" ");
//			System.out.print(currArr + "\n");
			prevArr.clear();
			prevArr.addAll(currArr);
			
			count+=1;
		}
		
	}

}
