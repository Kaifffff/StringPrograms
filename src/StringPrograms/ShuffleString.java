package StringPrograms;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        
        // Place each character at its target index
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        // Convert char array back to string
        return new String(shuffled);
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "codeleet";
        int[] indices1 = {4,5,6,7,0,2,1,3};
        System.out.println("Example 1: " + restoreString(s1, indices1)); // "leetcode"

        // Example 2
        String s2 = "abc";
        int[] indices2 = {0,1,2};
        System.out.println("Example 2: " + restoreString(s2, indices2)); // "abc"
    }


}
