package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_swap {

	public static void main(String[] args) {
		System.out.println("enter the first array elements separated with only space");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(sc.hasNext()) {
			list.add(sc.next());
		}
		String [] arr1= new String[list.size()];
		for(int j=0; j<list.size();j++) {
			arr1[j]=list.get(j);
			System.out.println(arr1[j]);
		}
		System.out.println("enter the second array elements separated with only space");
		//String [] arr2= {};
		while(sc.hasNext()) {
		//	arr2[i] = sc.next();
		}
		
	}

}
