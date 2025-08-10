package StringArray;

public class ReverseStringArray {
	public static void reverse(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String[] str = {"kaif", " md ", "shaikh"};

        System.out.println("Original array:");
        for (String s : str) {
            System.out.print("\"" + s + "\" ");
        }
        System.out.println();

        reverse(str);

        System.out.println("Reversed array:");
        for (String s : str) {
            System.out.print("\"" + s + "\" ");
        }
    }
}
