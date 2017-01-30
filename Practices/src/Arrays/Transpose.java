package Arrays;

public class Transpose {

	public static void main(String[] args) {
		int a [][] = new int[2][2];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++){
				a [i][j] = 2*i + j;
				System.out.print(a[i][j]);
				if (j == 1)
					System.out.println();
			}
		for (int i = 0; i < 2; i++)
			for (int j = i+1 ; j < 2; j++){
				int temp = a[i][j];
				a[i][j] = a [j][i];
				a[j][i] = temp;
			}
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++){
		System.out.print(a[i][j]);
		if (j == 1)
			System.out.println();
			}
		
		// TODO Auto-generated method stub

	}

}
