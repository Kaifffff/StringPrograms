package DSAapnaCollege;

public class LinkedList {
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	//function to add elements from start
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//function to add element at last
	public void addLast(int data) {
		
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	
	//function to insert element at particular index
	public void add(int idx , int data) {
		
		if(idx == 0) {
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		
		while(i < idx - 1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	//function to remove element from start
	
	public int removeFirst() {
		if(size == 0) {
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	//function to remove element from last
	
	public int removeLast() {
		if(size == 0) {
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		Node prev = head;
		for(int i = 0 ; i < size-2 ; i++) {
			prev = prev.next;
		}
		int val = prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
	}
	
	
	//function to print elements of list
	public void print() {
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//function for search index of element
	
//	public int itrSearch(int key) {
//		Node temp = head;
//		int i = 0;
//		while(temp != null) {
//			if(temp.data == key) {
//				return i;
//			}
//			temp = temp.next;
//			i++;
//		}
//		
//		return -1;
//	}
	
	
	// helper function of recSearch
	public int helper(Node head , int key) {
		if(head == null) {
			return -1;
		}
		if(head.data == key) {
			return 0;
		}
		
		int idx = helper(head.next , key);
		
		if(idx == -1) {
			return -1;
		}
		
		return idx+1;
	}
	
	//function for search index of element
	public int recSearch(int key) {
		return helper(head , key);
	}
	
	//Function to Reverse LinkedList
	public void reverse() {
		Node prev = null;
		Node curr = tail = head;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		head = prev;
	}
	
	
	// function for delete nth node from last
	
	
	public void deleteNthNodeFromEnd(int n) {
		//calculate Size
		int sz = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			sz++;
		}
		
		if(n == sz) {
			head = head.next;  // removeFirst()
			return ;
		}
		
		//sz - n
		
		int i = 1;
		int iToFind = sz - n;
		Node prev = head;
		while(i < iToFind) {
			prev =prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return;
	}
	
	//Helper function For finding Mid Node
	
	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	
	//Function Check Palindrom Or Not
	
	public boolean checkPalindrome() {
		if(head == null || head.next == null) {
			return true;
		}
		
		Node mid = findMid(head);
		
		
		Node prev = null;
		Node curr = mid;
		Node next ;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		Node right = head;
		Node left = prev;
		
		while(right != null) {
			if(left.data != right.data ) {
				return false;
			}
			
			left = left.next;
			right = right.next;
		}
		
		return true;
	}
	
	
	//check cycle exist or not 
	public static boolean isCycle() {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}
	
	
	// remove cycle
	
	public static void removeCycle() {
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				cycle = true;
				break;
			}
		}
		
		if(cycle == false) {
			return ;
		}
		
		Node prev=null;
		slow = head;
		
		while(slow != fast) {
			prev = fast;
			slow = slow.next;
			fast =fast.next;
			
		}
		
		prev.next = null;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
//		l1.addFirst(1);
//		l1.addFirst(2);
//		l1.addFirst(3);
//		l1.addFirst(4);
//		l1.addLast(5);
//		l1.addLast(9);
//		l1.add(2, 9);
//		l1.print();
//		System.out.println( "Size : "+l1.size);
//		System.out.println(l1.removeFirst());
//		l1.print();
//		System.out.println(l1.removeLast());
//		l1.print();
//		System.out.println(l1.itrSearch(3));
//		l1.reverse();
//		l1.print();
//		l1.addFirst(1);
//		l1.addFirst(2);
//		l1.addFirst(2);
//		l1.print();
//		System.out.println(l1.checkPalindrome());
		
		head = new Node(1);
		Node temp = new Node(2);
		head.next = temp;
		head.next.next = new Node(3); 
		head.next.next.next = temp;
		
		System.out.println(isCycle());
		removeCycle();
		System.out.println(isCycle());
		
	}
}
