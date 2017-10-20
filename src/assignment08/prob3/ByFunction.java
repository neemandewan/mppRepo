package assignment08.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ByFunction {
	
	public static void main(String[] args) {
		
		BiFunction<Double, Double, List<Double>> calc = (x,y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add(x * y);
			return list;
		};

        System.out.println(calc.apply(5.0, 3.0));
	}
}
