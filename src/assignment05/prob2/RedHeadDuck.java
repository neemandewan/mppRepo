package assignment05.prob2;

public class RedHeadDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("displaying");
	}
	
	@Override
	public void fly() {
		System.out.println(new FlyWithWings());
	}
	
	@Override
	public void quack() {
		System.out.println(new Quack());
	}
}
