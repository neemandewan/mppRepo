package assignment07.prob5;

public interface FlyBehavior {
	default void fly() {
		System.out.println("fly");
	}
}
