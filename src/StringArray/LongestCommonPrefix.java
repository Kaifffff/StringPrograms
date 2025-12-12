package StringArray;

public class LongestCommonPrefix {
	public static void main(String []args) {
		String str[] = {"flow","flew","flower"};
		String pref = str[0];
		for(int i = 1 ; i < str.length ; i++) {
			while(str[i].indexOf(pref) != 0) {
				pref = pref.substring(0 , pref.length()-1 );
			}
		}
		
		System.out.println(pref);
	}
}
