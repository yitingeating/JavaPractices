package Arrays;

public class InversePermutation {

	public static void main(String[] args) {
		int n = args.length;
		int a [] = new int [5];
		//int b [] = new int [5];
		for (int i = 0; i < 5; i++){
			int b = a[i];
			//b[a[i]] = a[i];
			a[i] = Integer.parseInt(args[i]);
			if (a[i] < 0 || a[i] >9 ||a[i] != i || )
				System.out.print("这个不行！！╭(╯^╰)╮");
		}
		int[] ainv = new int[n];
        for (int i = 0; i < n; i++)
            ainv[a[i]] = i;


        // print out
        for (int i = 0; i < n; i++)
            System.out.print(ainv[i] + " ");
        System.out.println();
		
			
		
		// TODO Auto-generated method stub

	}

}
