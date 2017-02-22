package ObjectOrientedProgramming;
//import java.util.*;

public class Sieve2 {
	
	private IntegerQueue number;
	private IntegerQueue primes;
	private int p, i, size, max;
	
	
	public Sieve2() {
		number = new IntegerQueue();
		primes = new IntegerQueue();
		p = 0;
		i = 2;
	}
	
	public void computeTo(int n) {
		max = (int)Math.sqrt(n);
		if (n > 2) {
			for (int i = 2; i < n+1; i++) {
				number.offer(i);
			}
			primes = new IntegerQueue();
		
			do {
				p = number.poll();
				//primes.offer(p);
			    number.offer(p);
				while (number.peek() != 2) {
				if (number.peek()%i == 0 && number.peek() != i) {
					number.poll();
					}
				else {
					int p2 = number.poll();
					//primes.offer(p2);
					number.offer(p2);
					}
				}
				i++;	
			}while (i <= Math.sqrt(n));
		}
		size = number.size();
		for (int i = 0; i < size; i++) {
			p = number.poll();
			primes.offer(p);
		}
	}
	
	public void reportResults() {
		if (!primes.isEmpty() && size > 11) {
			int line = size/12;
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < 11; j++) {
					System.out.print(primes.poll() + " ");
				}
				System.out.print(primes.poll());
				System.out.println();
			}
		}
		for (int j = 0; j < size%12; j++) {
			System.out.print(primes.poll() + " ");
			//System.out.print(primes.poll());
		}
		System.out.println();
	}
	
	public int getMax() {
		return max;
	}
	
	public int getCount() {
		return size;
	}

}



