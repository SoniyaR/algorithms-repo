package sorting;

import java.io.IOException;

public class SortingMain {

	public static void main(String[] args) {
		
		System.out.println("Choose the data:");
		int type=0;
		System.out.println("type:\n1.Numbers\n2.Strings");
		try {
			type= System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(type+"\nSize of set: ");
		
		System.out.println("Choose the type of sort to begin with:\n1.MergeSort"
				+ "\n2.BubbleSort\n3.SelectionSort\n4.InsertionSort\n");

	}

}
