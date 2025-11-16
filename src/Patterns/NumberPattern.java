package Patterns;

//  1
// 212
//32121
public class NumberPattern {
	public static void main(String []args) {
		int n = 3;
		for(int i = 1 ; i <= n ; i++ ) {
			
			for(int j = n-i ; j>= 1 ; j-- ) {
				System.out.print(" ");
			    }
			
	  	    for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Print ascending numbers (start from 2 to avoid repeating 1)
	        for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
		}
	}
}
