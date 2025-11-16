package practiceQuestions;

public class Main {
	public static void main(String args[]) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(1);
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		queue.enqueue(10);
		queue.enqueue(11);
	}
}
