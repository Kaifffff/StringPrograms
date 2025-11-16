package StringArray;

public class lengthOfLastWord {
	public static int lengthOflastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOflastWord("Hello World"));            // 5
        System.out.println(lengthOflastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOflastWord("luffy is still joyboy"));  // 6
    }
}
