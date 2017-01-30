package Arrays;

public class InversePermutation {

	public static void main(String[] args) {
		int n = args.length;
		int[] permutation = new int [n];
		
		//Build up the permutation array;
		for (int i = 0; i < n; i++) {
			permutation[i] = Integer.parseInt(args[i]);
		}
		
		//check permutation
		//A permutation here means an array that containing digits from 1 to n - 1.
		//All the numbers in that range should appear exactly once, no one missed, no one duplicated.
		//To check it, we can build up a visited array which is a boolean array to check whether an element is duplicated
		//and after traversing, check if the boolean array is all true.
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[permutation[i]]) visited[permutation[i]] = true;
			else {
				//if we visited one element for a second time, then this permutation isn't valid
				System.out.println(permutation[i] + " is duplicated");
				return;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				System.out.println(i + " is missed from the permutation");
				return;
			}
		}
		
		int[] ainv = new int[n];
        for (int i = 0; i < n; i++) {
        	ainv[permutation[i]] = i;
        }


        // print out
        for (int i = 0; i < n; i++)
            System.out.print(ainv[i] + " ");
        System.out.println();
		
			
		
		// TODO Auto-generated method stub

	}

}
