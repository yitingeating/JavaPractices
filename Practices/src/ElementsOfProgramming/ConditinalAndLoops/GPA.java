package ElementsOfProgramming.ConditinalAndLoops;

public class GPA {
	// Well Done!
	public static void main(String[] args) {
		int grade = (int)(Math.random()*100);
		if (grade > 89)
			System.out.print("A");
		else if (grade > 79)
			System.out.print("B");
		else if (grade > 69)
			System.out.print("C");
		else if (grade > 59)
			System.out.print("D");
		else
			System.out.print("F");
		// TODO Auto-generated method stub

	}

}
