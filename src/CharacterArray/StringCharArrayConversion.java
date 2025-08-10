package CharacterArray;

public class StringCharArrayConversion {
	 public static void main(String[] args) {
	        // String to char array
	        String original = "Hello World";
	        char[] chars = original.toCharArray();

	        System.out.println("Char array:");
	        for (char c : chars) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // Char array to string
	        String converted = new String(chars);
	        System.out.println("Converted back to String: " + converted);
	    }
}
