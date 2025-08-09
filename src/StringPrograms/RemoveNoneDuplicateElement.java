package StringPrograms;

public class RemoveNoneDuplicateElement {
	public static void main(String []args) {
		String str = "aabccce";
		for(int i = 1 ; i <= str.length() ; i++) {
			char chr =str.charAt(i);
			if(str.indexOf(chr) == str.lastIndexOf(chr) ) {
				System.out.println(chr);
			}
		}
	}
}
