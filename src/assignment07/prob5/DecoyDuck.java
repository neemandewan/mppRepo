package assignment07.prob5;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {
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
		MuteQuack.super.quack();
	}
}
