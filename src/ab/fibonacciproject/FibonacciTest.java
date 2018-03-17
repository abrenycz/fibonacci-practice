package ab.fibonacciproject;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFibonacci_OutToZero_isEmpty() {
		int[] solution = {};
		Assert.assertArrayEquals(FibonacciProgram.fibonacci(0), solution);
	}
	
	@Test
	public void testFibonacci_OutToFive() {
		int[] solution = {0,1,1,2,3};
		Assert.assertArrayEquals(FibonacciProgram.fibonacci(5), solution);
	}
}
