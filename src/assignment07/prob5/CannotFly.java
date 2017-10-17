package assignment07.prob5;

public interface CannotFly extends FlyBehavior {

	public default void fly() {
		// TODO Auto-generated method stub
		System.out.println("cannot fly");
	}
}
