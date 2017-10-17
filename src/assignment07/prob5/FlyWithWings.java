package assignment07.prob5;

public interface FlyWithWings extends FlyBehavior {

	public default void fly() {
		System.out.println("fly with wings");
	}
	
}
