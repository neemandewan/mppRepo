package assignment10.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThisSol {
	// This method creates a compiler error -- try to fix it
	List<String> processList(List<String> list)  {

		 return list.stream()
	    		   .map(x -> doNothingException(x)) // This will fail to compile 
	               .collect(Collectors.toList());
	 
	}
	
	String doNothingException(String x)
	{
		try {
			return doNothingIfShort(x);
		}catch (InputTooLongException e)
		{
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		
	}
	 
	String doNothingIfShort(String input) throws InputTooLongException {
	    if (input.length() > 3) throw new InputTooLongException();
	    else return input;
	}
	
	public static void main(String[] args) {
		FixThisSol ft = new FixThisSol();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		System.out.println(ft.processList(words1));
	}
	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}
