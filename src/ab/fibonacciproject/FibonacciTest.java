package ab.fibonacciproject;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFibonacci_OutToZero_isEmpty() {
		ArrayList<Integer> solution = new ArrayList<Integer>();
		Assert.assertEquals(FibonacciProgram.fibonacci(0), solution);
	}
	
	@Test
	public void testFibonacci_OutToFive() {
		ArrayList<Integer> solution = new ArrayList<Integer>();
		solution.add(0);
		solution.add(1);
		solution.add(1);
		solution.add(2);
		solution.add(3);
		Assert.assertEquals(FibonacciProgram.fibonacci(5), solution);
	}
}
