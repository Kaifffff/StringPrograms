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

//   *
//  ***
// *****
//*******
//  *****
//   ***
//    *
public class pattern {
	public static void main(String[] args) {
//		int i = 5;
//		
//		while(i >= 1) {
//			int j  = 1;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//			
//		}
		
//		int i = 9;
//		
//		while(i >= 5) {
//			int j = i;
//			while(j >= 1) {
//				System.out.print(j);
//				j--;
//			}
//			i--;
//			System.out.println();
//		}
		
		
//		int i = 1;
//		
//		while(i <= 4) {
//			int j = 1;
//			while(j <= i) {
//				if((i + j) % 2 == 0) {
//					System.out.print("0");
//				}else {
//					System.out.print("1");
//				}
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
//		int i = 1;
//		
//		while(i <= 5) {
//			int j = 1;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		int n = 4;
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = n - 1 ; j >= i ; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k<= (2 * i) - 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n - 1 ; i >= 1 ; i--) {
			for(int j = 1; j <= n - (i - 1) ; j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= (2 * i) - 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
