package LogicalQuestions;

public class MaxWithoutIf {
	public static void main(String[] args) {
        int a = 10, b = 20;
        int max = a - ((a - b) & ((a - b) >> 31));
        System.out.println("Max: " + max);
    }
}
