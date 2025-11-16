package NumberBasedLogicalQuestions;

public class LargestElement {
	public static void main(String[] args) {
        int[] arr = {1, 5, 9, 2, 8};
        int max = arr[0];
        for (int n : arr)
            if (n > max) max = n;
        System.out.println("Max: " + max);
    }
}
