package StringPrograms;

import java.util.HashSet;

public class CheckAllElementInStringUnique {
	public static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) return false; // add returns false if already exists
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("world")); // true
        System.out.println(isUnique("java"));  // false
    }
}
