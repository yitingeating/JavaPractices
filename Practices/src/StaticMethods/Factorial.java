package StaticMethods;

import sedgewick.StdOut;

public class Factorial {
	public static long factorial(int n){
		long f = 1;
		for (int i = 1; i < n + 1; i++)
			f *= i; 
		return f;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		StdOut.println(factorial(n));
		// TODO Auto-generated method stub

	}

}
