package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {	
	
	public static boolean check(int num) {
		
		String binary = Integer.toBinaryString(num);
		int left = 0 ;
		int right = binary.length()-1;
		System.out.println(binary);
		while(left < right) {
			if(binary.charAt(left) != binary.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String []args) {
		System.out.println(check(9));
	}
	
}