package assignment07.prob5;

public interface Quack extends QuackBehavior {

	public default void quack() {
		// TODO Auto-generated method stub
		System.out.println("quacking");
	}
	
}
