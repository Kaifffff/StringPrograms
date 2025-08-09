package StringPrograms;

public class ConvertStringToStringArray {

	public static void main(String[] args) {
		String str = "I Am Enginner";
		String strArr[] = str.split(" ");
		
		System.out.println("String :" + str);
		System.out.print("String Array : [ ");
		for(int i = 0 ; i < strArr.length ; i++) {
			System.out.print(strArr[i]+ " ");
		}
		System.out.print("]");

	}

}
