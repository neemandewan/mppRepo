package assignment05.prob2;

public class Quack implements QuackBehavior {

	@Override
	public String quack() {
		// TODO Auto-generated method stub
		return "quacking";
	}
	
	@Override
	public String toString() {
		return quack();
	}
}
