package assignment11.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture {
	
	public static void reverse(List<?> items) {
		System.out.println(reverseHelper(items));
	}
	
	private static <T> List<T> reverseHelper(List<T> items) {
		List<T> temp = new ArrayList<>();
		
		for(int i = 1; i <= items.size(); i++) {
			temp.add(items.get(items.size()-i));
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1, 2, 3);
		reverse(iList);	
		
		List<String> sList = Arrays.asList("krishna", "rajesh", "nibesh");
		reverse(sList);
	}
}
