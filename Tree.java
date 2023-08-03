package treeImpl;

import DSA.treeImpl.Node;

public class Tree { 
	//    static class Node {    
	//    int value; 
	//        Node left, right; 
	//          
	//        Node(int value){ 
	//            this.value = value; 
	//            left = null; 
	//            right = null; 
	//        } 
	//    } 

	public void insert(Node node, int value) {
		//left child Insertion 
		if (value < node.value) { 
			if (node.left != null)
			{
				insert(node.left, value); 
			} else { 
				System.out.println(" Inserted " + value + " to left of " + node.value); 
				node.left = new Node(value);
			} 
		} 
		//Right child insertion 
		else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println(" Inserted " + value + " to right of "+ node.value);
				node.right = new Node(value);
			}
		}
	}
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	
	public void preOrdertraversal(Node root) {
		if(root!=null) {
			System.out.print(root.value+ "  ");
			preOrdertraversal(root.left);
			preOrdertraversal(root.right);
		}
	}
	
	public void postOrdertraversal(Node root) {
		if(root!=null) {
			postOrdertraversal(root.right);
			postOrdertraversal(root.left);
			System.out.print(root.value+"  ");
		}
	}


	public static void main(String args[]) 
	{ 
		Tree tree = new Tree();
		Node root = new Node(5);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		tree.insert(root, 50);
		System.out.println("In Order Traversal of tree");
		tree.traverseInOrder(root);
		System.out.println("Pre- Order Traversal of tree");
		tree.preOrdertraversal(root);
		System.out.println("Post-Order Traversal of tree");
		tree.postOrdertraversal(root);
	}
}

