package assignment08.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Better {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Choco", "chord", "floco", "dance", "difference");
		
		char con = 'c';
		char noCon = 'd';
		
		WCount count = (l, c, d, len) -> l.stream()
				.filter(le -> le.length() == len)
				.map(let -> let.toLowerCase())
				.filter(let -> let.contains(String.valueOf(c)))
				.filter(let -> !let.contains(String.valueOf(d)))
				.collect(Collectors.toList()).size();
		
		System.out.println(count.countWords(list, con, noCon, 5));
	}

}
