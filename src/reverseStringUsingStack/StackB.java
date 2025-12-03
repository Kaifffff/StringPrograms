package reverseStringUsingStack;

import java.util.Stack;

public class StackB {
	public static String reverseString(String str) {
		Stack<Character> s = new Stack<>();
		int idx = 0;
		while(idx < str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		
		StringBuilder result = new StringBuilder(" ");
		
		while(!s.isEmpty()) {
			char c = s.pop();
			result.append(c);
		}
		str = result.toString();
		return str;
	}
	public static void main(String []args) {
		String str = "abc";
		String result = reverseString(str);
		System.out.println(result);
	}
}
