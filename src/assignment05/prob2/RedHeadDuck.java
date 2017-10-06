package assignment05.prob2;

public class RedHeadDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("display");
	}

	@Override
	public FlyBehavior getFlyBehavior() {
		// TODO Auto-generated method stub
		FlyBehavior fb = (FlyBehavior) new FlywithWings();
		return fb;
	}

	@Override
	public QuackBehavior getQuackBehavior() {
		// TODO Auto-generated method stub
		return null;
	}
}
