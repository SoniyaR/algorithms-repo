package trees;

import java.util.ArrayList;

class Node{
	int key;
	Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	public BinaryTree() {
		root = null;
	}
}

public class BinaryTreeTraverse {
	static ArrayList<Integer> preOrder = new ArrayList<>();
	static ArrayList<Integer> postOrder = new ArrayList<>();
	static ArrayList<Integer> inOrder = new ArrayList<>();
	
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
		
		preOrder.clear();
		postOrder.clear();
		inOrder.clear();
		
		TraversePreOrder(tree.root);
		TraversePostOrder(tree.root);
		TraverseInOrder(tree.root);
		
		System.out.println("preOrder =" + preOrder+ "\npostOrder =" + postOrder + "\ninOrder ="+ inOrder);

	}

	private static void TraverseInOrder(Node node) {
		if(node == null)
			return;
		
		TraverseInOrder(node.left);
		
		if(node!=null) {
			inOrder.add(node.key);
		}
		
		TraverseInOrder(node.right);
	}

	private static void TraversePostOrder(Node node) {
		
		if(node == null)
			return;
		
		TraversePostOrder(node.left);
		
		TraversePostOrder(node.right);
		
		if(node != null) {
			postOrder.add(node.key);
		}
		
	}

	private static void TraversePreOrder(Node node) {
		
		if(node == null)
			return;
		
		if(node != null) {
			preOrder.add(node.key);
		}
		
		TraversePreOrder(node.left);
		
		TraversePreOrder(node.right);
		
	}
}
