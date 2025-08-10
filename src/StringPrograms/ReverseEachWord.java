package StringPrograms;

public class ReverseEachWord {
	 public static String reverseEachWord(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            String reversedWord = reverseWord(words[i]);
	            result.append(reversedWord);

	            if (i != words.length - 1) {
	                result.append(" ");
	            }
	        }

	        return result.toString();
	    }

	    private static String reverseWord(String word) {
	        return new StringBuilder(word).reverse().toString();
	    }

	    public static void main(String[] args) {
	        String sentence = "Hello World from ChatGPT";
	        String reversed = reverseEachWord(sentence);
	        System.out.println(reversed);
	    }
}
