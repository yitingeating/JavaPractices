package ObjectOrientedProgramming;

import java.util.*;

public class SieveMain2 {
	
	public static void state() {
		System.out.println("This program computes all prime numbers up to a");
		System.out.println("maximum using the Sieve of Eratosthenes.");
		//System.out.println();
	}
	
	public static void deal(int input) {
		Sieve2 in = new Sieve2();
        //int input = console.nextInt();
		in.computeTo(input);
		System.out.println();
		//System.out.println();
		System.out.println("Primes up to " + input + "are as follows:");
		in.reportResults();
		System.out.println("% of primes " + (int)((double)in.getCount()/input*100) );
	}

	public static void main(String[] args) {
		state();
		Scanner console = new Scanner(System.in);
		System.out.print("Maximum n to compute (0 to quit)?");
		int input = console.nextInt();
		while (input != 0) {
			deal(input);
			System.out.println();
			System.out.print("Maximum n to compute (0 to quit)?");
			input = console.nextInt();
		}
	}
		//}

	

}
