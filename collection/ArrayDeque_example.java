package collection;

import java.util.ArrayDeque;
import java.util.Iterator;

/*
 * we can add and remove the elements from both the side of queue
 * its faster than stack when used as stack
 * its faster than Linked List when used as queue
 * 
 * its not thread safe
 * 
 */

public class ArrayDeque_example {

	public static void main(String[] args) {
		ArrayDeque<String> dequeArr = new ArrayDeque<String>();
		dequeArr.add("Megha");
		dequeArr.add("Pavani");
		dequeArr.add("Shruthi");
		dequeArr.offerFirst("toFront");
		dequeArr.offer("toLast");
		dequeArr.offerLast("toLastAgain");
		
		Iterator<String> it = dequeArr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
