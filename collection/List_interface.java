package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class List_interface {

	public static void main(String[] args) {
		
		System.out.println("Enter which one has to implement the Set interface:\n1.ArrayList\n2.LinkedList\n3.Vector\n4.Stack\n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:
				List<String> list1 = new ArrayList<String>();
				list1.add("one");
				ArrayList<String> arl = new ArrayList<String>();
				arl.add("ab");
				arl.add("cd");
				list1.addAll(arl);
				System.out.println("ÄrrayList elements: "+list1);
				
				break;
				
			case 2:
				List<String> list2 = new LinkedList<String>();
				list2.add("abcd");
				list2.add("abc");
				System.out.println("LinkedList elements: "+list2);
				break;
				
			case 3:
				List<String> list3 = new Vector<String>();
				list3.add("vone");
				list3.add("vtwo");
				System.out.println("vector elements: "+list3);
				break;
				
			case 4:
				List<String> list4 = new Stack<String>();
				list4.add("stack1");
				list4.add("stack2");
				list4.add("stack3");
				System.out.println("Stack elements: "+list4);
				break;
				
			default:
				System.out.println("enter correct input...");
				break;
			
		}

	}

}
