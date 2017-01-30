package Arrays;

public class Transpose {

	public static void main(String[] args) {
		int[][] a = new int[2][2]; //We usually put the two brackets right after the data type, rather than
		// after the variable name. This is one difference between Java and C++
		for (int i = 0; i < 2; i++) {
			System.out.println();  //Another way to start a new line is to print between the nested loops.
			for (int j = 0; j < 2; j++){
				a[i][j] = 2 * i + j;
				System.out.print(a[i][j]);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = i+1 ; j < 2; j++){
				int temp = a[i][j];
				a[i][j] = a [j][i];
				a[j][i] = temp;
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++){
				System.out.print(a[i][j]);
			}
		}
		// TODO Auto-generated method stub

	}

}
