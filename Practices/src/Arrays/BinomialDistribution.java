package Arrays;

public class BinomialDistribution {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double a[][] = new double[21][21];
		for (int i = 0; i < 21; i++){
			a[i][0] = 0.0;
			a[0][i] = 0.0;
		}
		
		for (int n = 1; n < 21; n++){
			for (int k = 1; k < 21; k++){
				a[n][k] = (a[n-1][k] + a[n-1][k-1])/2;
				a[1][1] = 1.0;
				//System.out.print(a[n][k] + " ");
			}
		}
		for (int j = 1; j < (num + 1); j++){
			//System.out.printl(a[3][3]);
			System.out.print(a[num][j] + " ");}
		// TODO Auto-generated method stub

	}

}
