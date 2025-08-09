package StringPrograms;

public class CheckifStringContainsOnlyDigits1 {
	 public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("98765")); // true
	        System.out.println(isNumeric("98a65")); // false
	    }
}
