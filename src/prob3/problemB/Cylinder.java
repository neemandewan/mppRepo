package prob3.problemB;

public class Cylinder {
	private double height = 1.0;
	private double radius = 1.0;
	private Circle circle;
	
	public Cylinder() {
		circle = new Circle(this.radius);
	}

	protected Cylinder(double radius) {
		circle = new Circle(radius);
	}

	protected Cylinder(double radius, double height) {
		circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume( ) {
		return 2*Math.PI * circle.getRadius() * circle.getRadius() * height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getRadius()=" + circle.getRadius() + ", getVolume()=" + getVolume() + "]";
	}
}
