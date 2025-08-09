package StringPrograms;

public class CountTheNumberOfWordsnaString {
	 public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        return str.trim().split("\\s+").length;
	    }

	    public static void main(String[] args) {
	        System.out.println(countWords("Hello World"));         // 2
	        System.out.println(countWords("   Java is   fun  "));  // 3
	        System.out.println(countWords(""));                    // 0
	    }
}
