package StringPrograms;

import java.util.Arrays;

public class SortCharactersOfAStringAlphabetically {
	public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "dcba";
        String sorted = sortString(input);
        System.out.println("Original: " + input);
        System.out.println("Sorted: " + sorted);
    }
}
