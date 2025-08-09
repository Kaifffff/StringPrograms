package StringPrograms;

public class ProgramToPrintEvenLengthWord {
	public static void main(String []args) {
		String str = "i am software engineer";
		for(String w : str.split(" ")) {
			if(w.length()%2==0) {
				System.out.println(w);
			}
		}
	}
}
