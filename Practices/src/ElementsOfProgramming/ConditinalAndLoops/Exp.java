package ElementsOfProgramming.ConditinalAndLoops;

public class Exp {

	public static void main(String[] args) 
	{   double x = 3;
		double term = 1.0;
        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + term;
            term = term*(x/i);
        }

        System.out.println(sum);}
}
			
		
		// TODO Auto-generated method stub


