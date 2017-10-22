package assignment10.prob1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TDDPracticeTest {

	@Test
	public void test() {
		List<String> value = Arrays.asList("krishnA","prabhaB");
		List<String> result = TDDPractice.changeLastCharToUpper.apply(value);
		assertEquals(value,result);
	}

}
