package assignment05.prob3;

public final class Rectangle implements Shape {
	private double length, width;

	protected Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	

	public double getLength() {
		return length;
	}



	public double getWidth() {
		return width;
	}



	@Override
	public double computeArea() {
		
		return length*width;
	}
	
}
