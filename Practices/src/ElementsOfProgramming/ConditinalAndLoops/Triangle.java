package ElementsOfProgramming.ConditinalAndLoops;

public class Triangle {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {   
			for (int j = 0; j < i; j++)
				System.out.print(".");  
			for (int l = 0; l < 6 - i; l++)
				System.out.print("*");
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
