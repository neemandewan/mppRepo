package assignment07.prob5;

public class RedHeadDuck extends Duck implements FlyWithWings, Quack {
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
	
	@Override
	public void fly() {
		FlyWithWings.super.fly();
	}
	
	@Override
	public void quack() {
		Quack.super.quack();
	}
}
