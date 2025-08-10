package StringPrograms;

public class AllSubstrings {
	 public static void printAllSubstrings(String str) {
	        int n = str.length();

	        for (int start = 0; start < n; start++) {
	            for (int end = start; end < n; end++) {
	                String substring = str.substring(start, end + 1);
	                System.out.println(substring);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String s = "abc";
	        printAllSubstrings(s);
	    }
}
