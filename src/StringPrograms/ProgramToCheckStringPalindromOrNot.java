package StringPrograms;

class demo{
	public boolean check(String s) {
		s = s.toLowerCase();
		String rev = "";
		for(int i = s.length() - 1 ; i >=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		return s.equals(rev) ;
	}	
}
public class ProgramToCheckStringPalindromOrNot {
	public static void main(String[] args) {
		demo d = new demo();
		String str = "levell";
		boolean rev = d.check(str);
		if(rev) {
			System.out.println("String is palindrom  ");
		}else {
			System.out.println("String is not a palindrom");
		}
	}
}
