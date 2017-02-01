package StaticMethods;

import sedgewick.StdOut;

public class Reverse {
	public static void exc(String[] a, int i, int j){
		String m = a[i];
		a[i] = a[j];
		a[j] = m;
	}
	public static String[] rev1(String[] a){
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++){
			b[i] = a[a.length - i -1];
		}
		return b;
	}
	public static String[] rev2(String[] a){
		for (int i = 0; i < a.length/2 ; i++){
			 exc(a, i, a.length - i -1);
		}
		return a;
	}

	public static void main(String[] args) {
		String[] r1 = rev1(args);
		for (int i = 0; i < args.length; i++) {
            StdOut.println(r1[i]);
            StdOut.println(args[i]);
        }
		String[] r2 = rev2(args);
		for (int i = 0; i < args.length; i++)
		StdOut.println(r2[i]);
		// TODO Auto-generated method stub

	}

}
