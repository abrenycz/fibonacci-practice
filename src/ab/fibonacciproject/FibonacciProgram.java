package ab.fibonacciproject;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciProgram {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> fibonacci(int input) {
		if(input==0)
			return new ArrayList<Integer>();
		else if(input==1)
			return new ArrayList<Integer>(0);
		else if(input==2) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(0);
			output.add(1);
			return output;
		}
		else {
			ArrayList<Integer> output = new ArrayList<Integer>();
			
			output.add(0);
			output.add(1);
			
			int num1 = 0;
			int num2 = 1;
			int num3;
			//test
			for(int i = 2; i < input; i++) {
				num3 = num1 + num2;
				output.add(num3);
				num1 = num2;
				num2 = num3;
			}
			return output;
		}
	}
	
	public static ArrayList<Integer> fibonacciRecursive(int input) {
		return fibonacciRecursiveHelper(input, new ArrayList<Integer>());
	}

	public static ArrayList<Integer> fibonacciRecursiveHelper(int input, ArrayList<Integer> output) {
		int size = output.size();
		
		if(size==input)
			return output;
		if(size==0)
			output.addAll(Arrays.asList(0,1));
		else
			output.add(output.get(size-1)+output.get(size-2));
		
		return fibonacciRecursiveHelper(input, output);
	}

}
