package assignment11.prob1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums = ints;
//		nums.add(3.14);
		
		/*
		 * Solution: 
		 * COMPILATION ERROR:-
		 * Type mismatch: cannot convert from List<Integer> to List<Number>
		 */
		
		List<Integer> ints1 = new ArrayList<>();
		ints1.add(1);
		ints1.add(2);
		List<? extends Number> nums1 = ints1;
//		nums1.add(3.14);
		
		/*
		 * Solution: 
		 * COMPILATION ERROR:-
		 * Type mismatch: The method add(capture#1-of ? extends Number) 
		 * in the type List<capture#1-of ? extends Number> is not applicable for the arguments (double)
		 */
	}
}
