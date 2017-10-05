package prob3.problemB;

import prob3.problemB.Circle;
import prob3.problemB.Cylinder;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(new Circle());
		System.out.println(new Circle(3));
		
		System.out.println(new Cylinder(3));
		System.out.println(new Cylinder(3, 2));
	}
}
