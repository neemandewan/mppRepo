package assignment05.prob2;

public class MallarDuck extends Duck {
	@Override
	public void display() {
		System.out.println("display");
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
