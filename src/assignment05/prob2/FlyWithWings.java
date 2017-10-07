package assignment05.prob2;

public class FlyWithWings implements FlyBehavior {

	@Override
	public String fly() {
		return "fly with wings";
	}
	
	@Override
	public String toString() {
		return fly();
	}
}
