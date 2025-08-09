package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
	public static String reverseVowels(String s) {
        // Set of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        ));

        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        // Two-pointer approach
        while (left < right) {
            // Move left to next vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            // Move right to previous vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "IceCreAm";
        System.out.println("Output 1: " + reverseVowels(s1)); // AceCreIm

        // Example 2
        String s2 = "leetcode";
        System.out.println("Output 2: " + reverseVowels(s2)); // leotcede
    }
}
