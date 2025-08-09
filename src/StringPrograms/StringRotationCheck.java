package StringPrograms;

public class StringRotationCheck {
	public static boolean rotateString(String s, String goal) {
        // Check if lengths are equal
        if (s.length() != goal.length()) {
            return false;
        }

        // Check if goal is a substring of s+s
        String combined = s + s;
        return combined.contains(goal);
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println("Example 1: " + rotateString(s1, goal1)); // true

        // Example 2
        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println("Example 2: " + rotateString(s2, goal2)); // false
    }

}
