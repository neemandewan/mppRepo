package assignment08.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		System.out.println("Lambda expression -->> ");
		
		//a. Use lambda expression		
		list.forEach(s -> System.out.println(s));
		
		System.out.println("\nMethod reference -->> ");
		
		//b. Use Method reference
		list.forEach(System.out::println);
	}
	
	
}