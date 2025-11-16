package patternsUsingWhileLoop;

//987654321
//87654321
//7654321
//654321
//54321

public class Pattern2 {
	public static void main(String[] args) {
		int i = 9;
		while(i >= 5) {
			int j = i;
			while(j >= 1) {
				System.out.print(j);
				j--;
			}
			System.out.println();
			i--;
		}
	}
}
