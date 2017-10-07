package assignment05.prob2;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public String quack() {
		// TODO Auto-generated method stub
		return "cannot quack";
	}
	
	@Override
	public String toString() {
		return quack();
	}
}
