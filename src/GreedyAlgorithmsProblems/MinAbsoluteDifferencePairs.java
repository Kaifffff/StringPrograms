package GreedyAlgorithmsProblems;

import java.util.Arrays;

//Given two arrays A and B of equal Length N. pair each element of  array A to an element in array B, such 
// that sum of absolute differences of all the pairs is minimum

public class MinAbsoluteDifferencePairs {
	public static void main(String []args) {
		int a[] = {1,2,3};
		int b[] = {2,1,3};
		Arrays.sort(a);
		Arrays.sort(b);
		
		int minDiff = 0;
		for(int i = 0 ; i< a.length ; i++) {
			minDiff += Math.abs(a[i] - b[i]);
		}
		
		System.out.println("min abs diff of pairs : " + minDiff);
	}
}
