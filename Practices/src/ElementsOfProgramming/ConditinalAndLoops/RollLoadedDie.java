package ElementsOfProgramming.ConditinalAndLoops;

public class RollLoadedDie {

	public static void main(String[] args) {
		int number = 1 + (int)(Math.random()*8);
		if (number > 6)
			number = 6;
		System.out.print(number);
		// TODO Auto-generated method stub

	}

}
