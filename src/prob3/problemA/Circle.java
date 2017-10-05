package prob3.problemA;

public class Circle {
	private double radius = 1.0;
	private String color = "Red";
	
	public Circle() {
	}
	
	protected Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", getArea()=" + getArea() + "]";
	}
	
}
