package Arrays;

public class Permutation {
	//excellent
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]); // some extras: the keyword final means after initialization, you can't change the value any more.
		// it will serve as a constant, so I can use upper case.
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i;
		}
		for (int i = 0; i < N; i++) {
			int r = (int) (Math.random() * (i+1));
			int swap = a[r];
			a[r] = a[i];
			a[i] = swap;    
		}
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a[j] == i) System.out.print("Q ");
				else           System.out.print("* ");
			}
			System.out.println("");
		}

		// TODO Auto-generated method stub

	}

}
