package assignment08.prob6;

@FunctionalInterface
public interface TestTwo<X,Y> {
	
	default void test1() {
		
	}
	
	Y set (X x);
}
