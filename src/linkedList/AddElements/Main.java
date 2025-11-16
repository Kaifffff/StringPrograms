package linkedList.AddElements;

public class Main {
	public static void main(String []args) {
		
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(3);
		list.addFirst(8);
		list.delete(3);
		list.printValues();
	}
}
