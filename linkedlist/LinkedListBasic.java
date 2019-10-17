package linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList{
	Node node;
	
	public void add(Node node) {
		node.next = node;
	}
	
}

public class LinkedListBasic {

	public static void main(String[] args) {
		//java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
		
		
		Node root = new Node(1);
		System.out.println(root);
		
		Node two = new Node(2);
		root.next = two;
		System.out.println(two);
		
		Node three = new Node(3);
		two.next = three;
		System.out.println(three);
		
		for(int i =0; i < 3; i++) {
			
		}

	}

}
