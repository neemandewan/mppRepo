package assignment05.prob2;

public class CannotFly implements FlyBehavior {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "cannot fly";
	}

	@Override
	public String toString() {
		return fly();
	}
}
