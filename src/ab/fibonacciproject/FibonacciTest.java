package ab.fibonacciproject;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFibonacci_OutToZero_isEmpty() {
		ArrayList<Integer> solution = new ArrayList<Integer>();
		Assert.assertEquals(solution, FibonacciProgram.fibonacci(0));
		Assert.assertEquals(solution, FibonacciProgram.fibonacciRecursive(0));

	}
	
	@Test
	public void testFibonacci_OutToFive() {
		ArrayList<Integer> solution = new ArrayList<Integer>();
		solution.addAll(Arrays.asList(0,1,1,2,3));
		Assert.assertEquals(solution, FibonacciProgram.fibonacci(5));
		Assert.assertEquals(solution, FibonacciProgram.fibonacciRecursive(5));
	}
	
	
}
