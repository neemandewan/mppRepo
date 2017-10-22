package assignment09.prob4;

import java.util.stream.IntStream;

public class SquareStream {
	
	public static void main(String[] args) {
		printSquares(4);
	}
	
	private static int nextSquare(int n) {
        int result = (int) Math.pow((int) Math.sqrt(n) + 1, 2);
        return result;
    }
	
	public static void printSquares(int num) {
		IntStream intStream = IntStream.iterate(1, f -> nextSquare(f)).limit(num);
		intStream.forEach(System.out::println);
	}
}
