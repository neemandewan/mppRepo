package assignment07.prob5;

public class RubberDuck extends Duck implements CannotFly, Squeak {
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
	
	@Override
	public void fly() {
		CannotFly.super.fly();
	}
	
	@Override
	public void quack() {
		Squeak.super.quack();
	}
}
