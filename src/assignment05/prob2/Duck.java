package assignment05.prob2;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void display() {
		System.out.println("display");
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}

}