package assignment08.prob6;

@FunctionalInterface
public interface TestIn<S,T,U,R> {
	 R apply(S s, T t, U u);
} 
