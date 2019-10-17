package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		q1.add("Sonal");
		q1.add("Kalyani");
		q1.add("Asmita");
		System.out.println("Elements added are : ");
		Iterator<String> it1 = q1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		q1.remove();
		q1.poll();
		q1.offer("atLast");
		System.out.println("after removing elements and added one at the end : ");
		Iterator<String> it2 = q1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
