package assignment10.prob1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TDDPractice {

	public TDDPractice(){
		System.out.println("TDDPractice");
	}
	
	public static Function<List<String>,List<String>> changeLastCharToUpper =
		words -> words.stream()
				.map(word ->  {
					char lastletter = Character.toUpperCase(word.charAt(word.length()-1));
					return word.substring(0, word.length()-1)+lastletter;
				}).collect(Collectors.toList());
		
	
	public static void main(String[] args) {
		
	}
}
