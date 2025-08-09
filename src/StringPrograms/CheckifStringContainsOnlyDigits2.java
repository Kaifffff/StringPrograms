package StringPrograms;

public class CheckifStringContainsOnlyDigits2 {
	  public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        for (char c : str.toCharArray()) {
	            if (c < '0' || c > '9') return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("123"));  // true
	        System.out.println(isNumeric("12x3")); // false
	    }
}
