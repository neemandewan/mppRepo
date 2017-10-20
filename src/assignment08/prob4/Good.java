package assignment08.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	
	public int countWords(List<String> words, char c, char d, int len) {
		
		return words.stream()
				.filter(le -> le.length() == len)
				.map(let -> let.toLowerCase())
				.filter(let -> let.contains(String.valueOf(c)))
				.filter(let -> !let.contains(String.valueOf(d)))
				.collect(Collectors.toList()).size();
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Choco", "Chord", "floco", "dance", "difference");
		
		Good good = new Good();
		char con = 'c';
		char noCon = 'd';
		
		System.out.println(good.countWords(list, con, noCon, 5));
	}
}
