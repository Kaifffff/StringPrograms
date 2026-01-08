package binarySearchTree;

import java.util.ArrayList;

public class Merge2BST {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void getinorder(Node root , ArrayList<Integer> inorder) {
		if(root == null) {
			return;
		}
		
		getinorder(root.left , inorder);
		inorder.add(root.data);
		getinorder(root.right , inorder);
		
	}
	
	public static Node createBST(ArrayList<Integer> finalArray , int st , int end) {
		if(st > end) {
			return null;
		}
		int mid = (st + end) / 2 ;
		Node root = new Node(finalArray.get(mid));
		root.left = createBST(finalArray , st , mid - 1);
		root.right = createBST(finalArray , mid + 1 , end);
		return root;
	}
	public static Node mergeBST(Node root1 , Node root2) {
		ArrayList<Integer> inorder1 = new ArrayList<>();
		getinorder(root1,inorder1);
		ArrayList<Integer> inorder2 = new ArrayList<>();
		getinorder(root2,inorder2);
		
		ArrayList<Integer> finalArray = new ArrayList<>();
		
		int i = 0 ,j = 0;
		while(i < inorder1.size() && j < inorder2.size()) {
			if(inorder1.get(i) <= inorder2.get(j)) {
				finalArray.add(inorder1.get(i));
				i++;
			}else {
				finalArray.add(inorder2.get(j));
				j++;
			}
		}
		while(i < inorder1.size()) {
			finalArray.add(inorder1.get(i));
			i++;
		}
		while(j < inorder2.size()) {
			finalArray.add(inorder2.get(j));
			j++;
		}
		return createBST(finalArray , 0 , finalArray.size() - 1);
	}
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String []args) {
		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(4);
		
		Node root2 = new Node(9);
		root2.left = new Node(3);
		root2.right = new Node(12);
		Node root = mergeBST(root1 , root2);
		preorder(root);
	}
}
