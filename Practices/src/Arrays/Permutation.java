package Arrays;

public class Permutation {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * (i+1));
            int swap = a[r];
            a[r] = a[i];
            a[i] = swap;    
        }
        for (int i = 0; i < n; i++)
         System.out.print(a[i] + " ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println("");
        }
        
		// TODO Auto-generated method stub

	}

}
