package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i , Integer j) {
				if(i%10 > j%10) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		List<Integer> nums = new ArrayList<>();
		nums.add(43);
		nums.add(22);
		nums.add(58);
		nums.add(71);
		
		Collections.sort(nums , com);
		System.out.println(nums);
		
	}
}
