package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice {
	// check string is unique or not
	public static boolean check(String str){
		Set<Character> unique = new HashSet<>();
		
		if(str == null || str.isEmpty()) {
			return false;
		}
		
		for(char ch : str.toCharArray()) {
			if(!unique.add(ch)) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	//check string contains only digit
	public static boolean checkDigit(String str) {
		
		if(str == null || str.isEmpty()) {
			return false;
		}
		
		for(char ch : str.trim().toCharArray()) {
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		
		return true;
	}
	
	//Count Frequency Of Each Character
	public static void countFreq(String str) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	//Count Number of Words
	public static int numberOfWords(String str) {
		if(str == null || str.isEmpty()) {
			return -1;
		}
		return str.trim().split("\\s+").length;
	}
	
	
	//Count Vowels And Consonants
	public static void countVAndC(String str){
		
		int v = 0,c = 0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch) != -1) {
					v++;
				}else {
					c++;
				}
			}
		}
		
		System.out.println("vowels : " + v + " consonants : " + c);
	}
	
	//check String Palindrom or not
	public static boolean checkStringPalindromOrNot(String str) {
		str = str.toLowerCase();
		String rev = "";
		
		for(int i = str.length() - 1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		return str.equals(rev);
	}
	
	
	//program to print even length words
	public static void printEvenLengthWords(String str) {
		for(String s : str.split("\\s+")) {
			if(s.length()%2 == 0) {
				System.out.println(s);
			}
		}
	}
	
	//remove none duplicate
	public static void removeNonDuplicate(String str) {
		List<Character> list = new ArrayList<>();
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		
		char result[] = new char[list.size()];
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = list.get(i);
		}
		
		for(int j = 0 ; j < result.length ; j++) {
			System.out.print(result[j] + " ");
		}
		
	}
	
	//reverce vowels 
	public static void reverceVAndC(String str) {
		Set<Character> vowels = new HashSet<>(Arrays.asList(
				'A','E','I','O','U','a','e','i','o','u'
				));
		
		int left = 0;
		int right = str.length() - 1;
		char ch[] = str.toCharArray();
		while(left < right) {
			
			while(left < right && !vowels.contains(ch[left])) {
				left++;
			}
			while(left < right && !vowels.contains(ch[right])) {
				right--;
			}
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		
		System.out.println(new String(ch));
		
		
	}
	
	//print duplicates from string
	
	public static void printDuplicate(String str){
		List<Character> list = new ArrayList<>();
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				for(int i = 0 ; i < entry.getValue(); i++) {
					list.add(entry.getKey());				}
			}
		}
//		System.out.println(list);
		char ch[] = new char[list.size()];
		for(int i = 0 ; i < list.size(); i++) {
			ch[i] = list.get(i);
		}
		
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.print(ch[i] + " ");
		}
	}
	
	//check string anagram or not
	
	public static boolean chechAnagram(String str1 , String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
	
	//first non repeated element
	
	public static void repeated(String str) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	//length of Last Word
	public static int lengthOfWord(String str) {
		int length = 0;
		int right = str.length() - 1;
		int left = 0;
		while(left <= right && str.charAt(right) == ' ') {
			right--;
		}
		while(left <= right && str.charAt(right) != ' ') {
			length++;
			right--;
		}
		return length;
	}
	
	//second largest integer in array 
	
	public static void SLE(int arr[]) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0 ; i <= arr.length - 1 ;i++) {
			if(first < arr[i]) {
				second = first;
				first = arr[i];
			}else if(second > arr[i] && second != first) {
				second = arr[i];
			}
		}
		System.out.println(second);
	}
	
	//print missing elements from string
	
	public static void printMissing(int[] arr , int n) {
		int acctualCount = 0;
		int expectedCount = n*(n+1)/2;
		
		for(int i = 0 ; i <= arr.length - 1;i++){
			acctualCount += arr[i];
		}
		System.out.println(expectedCount - acctualCount);
	}
	
	//Remove duplicate from array
	public static void removeDuplicate(int[] arr) {
		
//		Set<Integer> set = new LinkedHashSet<>();
//		
//		for(int n : arr) {
//			if(!set.contains(n)) {
//				set.add(n);
//			}
//		}
//		
//		System.out.println(set);
		
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int n : arr) {
			map.put(n,map.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		int result[] = new int[list.size()];
		System.out.println(list);
		for(int i = 0 ; i <= result.length-1 ; i++) {
			result[i] = list.get(i);
		}
		for(int i = 0 ; i <= result.length-1; i++) {
			System.out.print(result[i]);
		}
	}
	
	//check prime 
	public static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}
		for(int i = 2 ; i < num ; i++ ) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
		
	}
	//print prime range
	public static void primeRange(int num) {
		for(int i = 2 ; i <= num ; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	//print sub array 
	public static void printSubArray(int[] arr) {
		for(int i = 0 ; i <=arr.length-1;i++) {
			for(int j = i ; j <= arr.length-1 ; j++) {
				for(int k = i ; k <= j ; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		
		}
	}
	
	//print pair of Array
	public static void pairOfArray(int[] arr) {
		for(int i = 0 ; i <= arr.length-1 ; i++) {
			int curr = arr[i];
			for(int j = i + 1 ; j <= arr.length-1 ; j++) {
				System.out.print("(" + curr + " " + arr[j] +")");
			}
		}
	}
	//max sub array sum 
	public static void maxSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int curr = 0;
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
			for(int j = i ; j <= arr.length - 1 ; j++) {
				curr = 0;
				for(int k = i ; k <= j ; k++) {
					curr += arr[k];
					
				}
				if(max < curr) {
					max = curr;
				}
			}
			
		}
		System.out.println(max);
	}
	
	//merge two arrays alternately
	
	public static void mergeArrays() {
		int arr1[] = {1,3,5};
		int arr2[] = {2,4,6};
		
		List<Integer> list = new ArrayList<>();
		
		int i = 0 , j = 0;
		while( i < arr1.length && j < arr2.length) {
			list.add(arr1[i++]);
			list.add(arr2[j++]);
		}
		while( i < arr1.length) {
			list.add(arr1[i++]);
		}
		while(j < arr2.length) {
			list.add(arr2[j++]);
		}
		int result[] = new int[list.size()];
		for(int k = 0 ; k <= result.length - 1 ; k++) {
			result[k] = list.get(k);
		}
		for(int k = 0 ; k <= result.length -1 ; k++) {
			System.out.print(result[k] + " ");
		}
	}
	
	// minimum swap to make to strings equal
	
	public static int minSwap(String str1 , String str2) {
		int count = 0;
		
		if(str1.length() != str2.length()) {
			return -1;
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		for(int i = 0 ; i <=ch1.length-1 ; i++ ) {
			if(ch1[i] != ch2[i]) {
				int j = i + 1;
				
				while(j < ch1.length && ch1[j] != ch2[i] ) {
					j++;
				}
				while(j > i) {
					char temp = ch1[j];
					ch1[j] = ch1[j -1];
					ch1[j-1] = temp;
					j--;
					count++;
				}	
			}
		}
		return count;
	}
	
	// print sub array with given sum
	
	public static void printSubArray() {
		int arr[] = {1,2,3,4,5,6};
		int target = 11;
		int start = 0;
		int sum = 0;
		
		for(int end = 0 ; end < arr.length ; end++) {
			sum+=arr[end];
			
			while(sum > target && start <= end) {
				sum-=arr[start];
				start++;
			}
			
			if(sum == target) {
				for(int i = start ; i <= end ; i++) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		
	}
	
	//program to matrix diagonal sum
	public static void diagonalSum() {
		int mat[][] = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		int presum = 0;
		int postsum = 0;
		
		for(int i = 0 ; i < mat.length ; i++) {
			presum+=mat[i][i];
			postsum+=mat[mat.length-i-1][i];
		}
		
		System.out.println(presum + " " + postsum);
		
	}
	//print fibonacci series
	public static void fib() {
		int n = 5;
		int a = 0;
		int b = 1;
		 
		for(int i = 0 ; i <n ; i++) {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}
	}
	
	//program to move zeros at the end 
	
	public static void moveZero() {
		int arr[] = {1,3,0,4,0};
		int pos = 0;
		
		for(int i = 0 ; i <=arr.length-1;i++ ) {
			if(arr[i] != 0) {
				arr[pos++] = arr[i];
			}
		}
		
		while(pos <= arr.length-1) {
			arr[pos++] = 0;
		}
		
		
		for(int j = 0; j <= arr.length-1 ; j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	// check binary representation is palindrom
	public static boolean isPalindrom(int num) {
		String binary = Integer.toBinaryString(num);
		int left = 0;
		int right = binary.length() -1;
		 while(left < right) {
			 if(binary.charAt(left) != binary.charAt(right)) {
				 return false;
			 }
			 left++;
			 right--;
		 }
		 return true;
	}
	
	//Intersection of two array
	
	public static void Intersection() {
		int arr1[] = {1,2,2,3,5,7};
		int arr2[] = {2,2,3};
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int n : arr1) {
			map.put(n, map.getOrDefault(n,0)+1);
		}
		
		for(int n : arr2 ) {
			if(map.containsKey(n) && map.get(n) > 0) {
				list.add(n);
				map.put(n, map.get(n) - 1);
			}
		}
		System.out.println(list);
	}
	
	// third maximum number
	public static void thirdMax() {
		int arr[] = {1,2,3,4,5,6,7};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(n > first) {
				third = second;
				second = first;
				first = n;
			}else if( n > second && n != first ) {
				second = n;
				third = second;
			}else if(n > third && n != second) {
				third = n;
			}
		}
		
		System.out.println(third);
	}
	public static void main(String[] args) {
		String str = "aab";
//		System.out.println(check(str));
//		System.out.println(checkDigit("1234"));
//		countFreq("aabbc");
//		System.out.println(numberOfWords("hello java"));
//		countVAndC("aaaa");
//		System.out.println(checkStringPalindromOrNot("nayan"));
//		printEvenLengthWords("I am a Engineer");
//		removeNonDuplicate("aabccd");
//		reverceVAndC("IceCreAm");
//		printDuplicate("aabbcdddd");
//		System.out.print(chechAnagram("Listen" , "silent"));
//		repeated("AABBC");
//		System.out.println(lengthOfWord("java for students"));
		int arr[] = {1,2,4,5,6};
//		SLE(arr);
//		printMissing(arr , 6);
//		removeDuplicate(arr);
//		System.out.println(isPrime(4));
//		primeRange(10);
//		printSubArray(arr);
//		pairOfArray(arr);
//		maxSum(arr);
//		mergeArrays();
//		minSwap("bac","abc");
//		printSubArray();
//		diagonalSum();
//		fib();
//		moveZero();
//		System.out.println(isPalindrom(10));
//		Intersection();
		thirdMax();
  }
}
