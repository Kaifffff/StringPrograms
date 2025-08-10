package CharacterArray;

import java.util.HashSet;

public class RemoveDuplicatesFromCharArray {
	 public static int removeDuplicates(char[] chars) {
	        HashSet<Character> seen = new HashSet<>();
	        int write = 0;

	        for (int read = 0; read < chars.length; read++) {
	            if (!seen.contains(chars[read])) {
	                seen.add(chars[read]);
	                chars[write] = chars[read];
	                write++;
	            }
	        }

	        return write;
	    }

	    public static void main(String[] args) {
	        char[] chars = {'a', 'b', 'a', 'c', 'b', 'd'};
	        System.out.print("Before removing duplicates : ");
	        for (int i = 0; i < chars.length; i++) {
	            System.out.print(chars[i] + " ");
	        }
	        System.out.println();
	        int length = removeDuplicates(chars);

	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < length; i++) {
	            System.out.print(chars[i] + " ");
	        }
	        System.out.println("\nLength of unique chars: " + length);
	    }
}
