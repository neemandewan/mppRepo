package assignment07.prob5;

public interface Squeak extends QuackBehavior {

	public default void quack() {
		// TODO Auto-generated method stub
		System.out.println("squeaking");
	}
	
}
