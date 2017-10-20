package assignment09.prob2;

import java.math.BigInteger;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {
	
	final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE, x -> x.add(BigInteger.ONE));
            
    final Function<Long, Stream<BigInteger>> primesLimit = x -> Stream.iterate(BigInteger.ONE, n -> n.nextProbablePrime()).limit(x);
	
	Supplier<Stream<BigInteger>> streamSupplier = () -> primes;
	
	public void  printFirstNPrimes(long n) {
		
		primesLimit.apply(n).forEach(s -> System.out.println(s));
		
		/*Stream<BigInteger> primes1 = streamSupplier.get()
				.filter(b -> b.isProbablePrime(1) == true )
				.limit(n);
		
		primes1.forEach(s -> System.out.println(s));*/
		
		/*Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE, x -> x.add(BigInteger.ONE))
				.filter(b -> b.isProbablePrime(1) == true )
				.limit(n);
		
		primes.forEach(s -> System.out.println(s));*/
	}
	
	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}
