package assignment09.prob2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
    final Function<Long, Stream<BigInteger>> primesLimit = x -> Stream.iterate(BigInteger.valueOf(2), n -> n.nextProbablePrime()).limit(x);
	
	public void  printFirstNPrimes(long n) {
		
		System.out.println(Arrays.asList(primesLimit.apply(n).collect(Collectors.toList())));
		
	}
	
	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}
