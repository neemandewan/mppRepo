package assignment03.prob3.problemA;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		
	}

	protected Cylinder(double radius) {
		super(radius);
	}

	protected Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume( ) {
		return 2*Math.PI * super.getRadius() * super.getRadius() * height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getRadius()=" + super.getRadius() + ", getVolume()=" + getVolume() + "]";
	}
	
	
}
