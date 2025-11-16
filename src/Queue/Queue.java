package Queue;

public class Queue {

	private int front = 0;
	private int rear = -1;
	private int size = 0 ;
	private int[] arr = new int[4];
	
	public void enqueue(int data) {
		if(!isFull()) {
			rear = (rear + 1) % 4;
			arr[rear] = data;
			size++;
		}else {
			throw new RuntimeException("Queue is Full");
		}
	}

	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		int data = arr[front];
		front = (front + 1) % 4;
		size--;
		return data;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		return arr[front];
	}
	
	public boolean isFull() {
		return size == 4;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
