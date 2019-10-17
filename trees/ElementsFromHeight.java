package trees;

import java.util.ArrayList;

//class Node{
//	int key;
//	Node left, right;
//	public Node(int item) {
//		key = item;
//		left = right = null;
//	}
//}
//
//class BinaryTree {
//	Node root;
//	public BinaryTree() {
//		root = null;
//	}
//}

public class ElementsFromHeight {
	
	static ArrayList<Integer> list ;

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(7);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(8);
		tree.root.right.right = new Node(9);
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.right = new Node(5);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.right = new Node(11);
		
		int height=3;
		list = new ArrayList<>();
		
		findElements(tree.root, height);
		
		System.out.println(list);

	}

	private static void findElements(Node node, int height) {
		
		if(node == null) {
			System.out.println("node is null");
			return;
		}
		
		if(height == 0 && node != null) {
			list.add(node.key);
			return;
		}
		
		findElements(node.left, height-1);
		findElements(node.right, height-1);
		
	}

}
