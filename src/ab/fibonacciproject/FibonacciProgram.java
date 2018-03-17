package ab.fibonacciproject;

import java.util.ArrayList;

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
			
			for(int i = 2; i < input; i++) {
				num3 = num1 + num2;
				output.add(num3);
				num1 = num2;
				num2 = num3;
			}
			return output;
		}
	}

}
