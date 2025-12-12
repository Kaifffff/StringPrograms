package StringArray;

public class LongestCommonSuffix {
	public static void main(String []args) {
		String str[] = {"parking","dinning","cooking"};
		String suffix = str[0];
		for(int i = 1 ; i < str.length ; i++) {
			while(!str[i].endsWith(suffix)) {
				suffix = suffix.substring(1);
			}
		}
		
		System.out.println(suffix);
	}
}
