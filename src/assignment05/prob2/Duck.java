package assignment05.prob2;

public abstract class Duck {
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void display() {
		System.out.println("display");
	}

	public abstract FlyBehavior getFlyBehavior();

	public abstract QuackBehavior getQuackBehavior();
}
