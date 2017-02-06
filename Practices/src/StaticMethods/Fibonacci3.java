package StaticMethods;

import sedgewick.StdOut;

public class Fibonacci3 {
	public static int fib(int n){
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		if (n % 2 == 1){
			int a = fib((n + 1)/2 -1);
			int b = fib((n + 1)/2);
			return (int)(a * a + b * b);
		}
		else{
			int a = fib((n)/2 - 1);
			int b = fib((n)/2);
			return (int)(2*a + b)*b;
		}
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for(int i = 0; i < N + 1; i++){
			StdOut.println(fib(i));
		}
	}
}
		// TODO Auto-generated method stub



