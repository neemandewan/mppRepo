package assignment07.prob5;

public interface QuackBehavior {
	public default void quack() {
		System.out.println("Quack");
	}
}
