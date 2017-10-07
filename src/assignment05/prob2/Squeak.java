package assignment05.prob2;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {
		// TODO Auto-generated method stub
		return "squeaking";
	}
	
	
	@Override
	public String toString() {
		return quack();
	}
}
