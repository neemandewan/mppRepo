package assignment05.prob3;

public class Triangle implements Shape {
	private double base, height;

	protected Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		
		return 0.5*base*height;
	}
	
	
}
