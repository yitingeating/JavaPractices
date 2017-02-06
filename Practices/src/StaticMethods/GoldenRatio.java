package StaticMethods;

import sedgewick.StdOut;

public class GoldenRatio {
	public static double golden(int n){
		if (n == 0)
			return 1;
		return 1.0 + 1.0 / golden(n-1);
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double Golden = golden(N);
		StdOut.print(Golden);
		// TODO Auto-generated method stub

	}

}
