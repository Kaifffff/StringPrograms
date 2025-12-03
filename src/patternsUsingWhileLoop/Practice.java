package patternsUsingWhileLoop;
//*****
//****
//***
//**
//*

//987654321
//87654321
//7654321
//654321
//54321

//0
//10
//010
//1010

//
//*
//**
//***
//****
//*****

// *
//***
//*****
//*******
//*****
// ***
//  *

//  1
//1 2 1
//1 3 3 1
//1 4 6 4 1

public class Practice {
	public static void main(String []args) {
//		int n = 5;
//		while(n >= 1) {
//			int j = 1;
//			while(j <= n) {
//				System.out.print("*");	
//				j++;
//			}
//			System.out.println();
//			n--;
//		}
		
//		int i = 1;
//		while(i < 5) {
//			int j = 1;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
//		int n = 9;
//		while(n >= 5) {
//			int j = n;
//			while(j >= 1) {
//				System.out.print(j);
//				j--;
//			}
//			n--;
//			System.out.println();
//		}
		
		
//		int n = 4;
//		int i = 1;
//		while(i <= n) {
//			int j = 1;
//			while(j <= i) {
//				if((i + j) % 2 == 0) {
//					System.out.print("0");
//				}else {
//					System.out.print("1");
//				}
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
//		int n = 5;
//		
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 0 ; j < n - i ; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0 ; k < (2 * i) - 1 ; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = n - 1 ; i >= 0 ; i--) {
//			for(int j = 0 ; j < (n - i)+2 ; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0 ; k < (2 * i) - 1 ; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int n = 4;
		int i = 0;
		while(i < n) {
			int number = 1;
			int s = n - i;
			while(s > 0) {
				System.out.print(" ");
				s--;
			}
			
			int j = 0;
			while(j <= i) {
				System.out.print(number + " ");
				number = number * (i - j)/(j + 1);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}
}
