package assignment05.prob3;

public final class Circle implements Shape {
	private double radius;
	
	

	protected Circle(double radius) {
		super();
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}



	@Override
	public double computeArea() {
		
		return Math.PI*radius*radius;
	}
	
	
}
