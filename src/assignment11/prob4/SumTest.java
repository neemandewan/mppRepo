package assignment11.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumTest {
	
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
//		nums.add(3.14);
		
		/*
		 * Solution: 
		 * COMPILATION ERROR:-
		 * The method add(capture#2-of ? extends Number) in the type 
		 * List<capture#2-of ? extends Number> is not applicable for the arguments (double)
		 */
		
		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> nums1 = objs;
		nums1.add(3);
//		double sbl = sum(nums1);
		
		/*
		 * Solution: 
		 * COMPILATION ERROR:-
		 * The method sum(List<? extends Number>) in the type SumTest is not applicable for 
		 * the arguments (List<capture#4-of ? super Integer>)
		 */
	}
	
	private static double sum(List<? extends Number> nums) {
		// TODO Auto-generated method stub
		double s = 0.0;
		for(Number num : nums) s += num.doubleValue();
		return s;
	}
}
