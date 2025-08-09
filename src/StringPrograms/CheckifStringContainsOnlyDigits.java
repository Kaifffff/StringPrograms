package StringPrograms;

public class CheckifStringContainsOnlyDigits {
	 public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("12345")); // true
	        System.out.println(isNumeric("12a45")); // false
	        System.out.println(isNumeric(""));      // false
	    }
}
