package StringPrograms;

public class ProgramToInsertOneStringIntoAnother {
	public static void main(String []args) {
		String str = "i am parbhani ";
		String wantToInsert = "From ";
		int index = 4;
		String newstr = new String();
		for(int i = 0 ; i <str.length() ; i++) {
			newstr = newstr + str.charAt(i);
			
			if( i == index) {
				newstr = newstr + wantToInsert;
			}
		}
		
		System.out.println("old string :" + str);
		System.out.println("new String :" + newstr);
		
	}
}
