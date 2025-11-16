package patternsUsingWhileLoop;


//0
//10
//010
//1010

public class pattern3 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			int j = 1;
			while(j <= i) {
				if((i + j) % 2 == 0 ) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
