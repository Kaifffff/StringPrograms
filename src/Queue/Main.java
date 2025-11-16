package Queue;

public class Main {
	public static void main(String args[]) {
		Queue nums = new Queue();
		
		nums.enqueue(3);
		nums.enqueue(4);
		System.out.println(nums.dequeue());
	}
}
