package binarySearchTree;

import binarySearchTree.IsValidBST.Node;

public class MirrorABST {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	public static Node mirrorBST(Node root) {
		if(root == null) {
			return null;
		}
		
		Node leftMirror = mirrorBST(root.left);
		Node rightMirror = mirrorBST(root.right);
		root.left = rightMirror;
		root.right = leftMirror;
		
		return root;
	}
	public static void preOrder(Node root) {
		if(root == null) {
			return ;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String []args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root = mirrorBST(root);
		preOrder(root);
	}
}
