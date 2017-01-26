package ElementsOfProgramming.ConditinalAndLoops;

public class BreakAndNew {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 78) break;
			
			if (i % 2 == 0) continue;
			else System.out.print(i + " ");			
		}
	}
}
