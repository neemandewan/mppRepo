package assignment11.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Smallest {
	
	private static <T> T secondSmallest(List<T> items) {
		return items.stream().sorted().collect(Collectors.toList()).get(1);
	}
	
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1, 2, 3, 0, 4, 6, 10, 1, 5);
		int i = secondSmallest(iList);
		System.out.println(i);
		
		List<String> sList = Arrays.asList("krishna", "rajesh", "nibesh");
		String s = secondSmallest(sList);
		System.out.println(s);
	}
}
