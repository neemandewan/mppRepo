package assignment05.prob3;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(21));
		shapes.add(new Rectangle(10,12));
		shapes.add(new Triangle(8,10));
		shapes.add(new Circle(13));
		shapes.add(new Rectangle(15,15));
		shapes.add(new Triangle(18,6));
		
		double sum = 0;
		for(Shape s: shapes) {
			sum += s.computeArea();
		}
		
		System.out.println("Sum of Areas = " + sum);
	}

}
