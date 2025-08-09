package StringPrograms;

public class LargestOddNumber {
	public static String largestOddNumber(String num) {
        // Start from the end and move left
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) { // Check if it's an odd digit
                return num.substring(0, i + 1); // Return from start to that index
            }
        }
        return ""; // No odd digit found
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(largestOddNumber("52"));     // Output: "5"
        
        // Example 2
        System.out.println(largestOddNumber("4206"));   // Output: ""
        
        // Example 3
        System.out.println(largestOddNumber("35427"));  // Output: "35427"
    }
}
