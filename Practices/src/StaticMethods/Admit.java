package StaticMethods;
import java.util.*;

public class Admit {

	public static void compare(Scanner console){
		state();
		double p1 = compute(console, 1);
		double p2 = compute(console, 2);
		System.out.printf("First applicant overall score  = " + "%.1f", p1);
		System.out.println();
		System.out.printf("Second applicant overall score  = " + "%.1f", p2);
		System.out.println();
		if (p1 > p2)
			System.out.println("The first applicant seems to be better");
		else if(p1 < p2)
			System.out.println("The second applicant seems to be better");
		else
			System.out.println("The two applicants seem to be equal");	
	}
	
	public static double compute(Scanner console, int applicantNbr){
		double score = 0;
		int type = type(console, applicantNbr);{
		if (type == 1)
		    score = SATscore(console);
		else 
			score = ACTscore(console);}
		double GPA = GPA(console);
		double result = score + GPA;
		return result;
	}
	public static void state(){
		System.out.println("This program compares two applicants to");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant.  For each candidate I will need");
		System.out.println("either SAT or ACT scores plus a weighted GPA");
		System.out.println();	
	}
	public static int type(Scanner console, int applicantNbr){
		System.out.println("Information for applicant #" +  applicantNbr + ":");
		System.out.print("    do you have 1) SAT scores or 2) ACT scores?");
		int type = console.nextInt();

		return type;
	}
	public static double SATscore(Scanner console){
		System.out.print("    SAT math?");
		int math = console.nextInt();
		System.out.print("    SAT critical reading?");
		int reading = console.nextInt();
		System.out.print("    SAT writing?");
		int writing = console.nextInt();
		double score = (2*math + reading + writing)/32;
		System.out.printf("    exam score = " + "%.1f", score);
		System.out.println();
		return score;
	}
	public static double ACTscore(Scanner console){
		System.out.print("    ACT English?");
		int English = console.nextInt();
		System.out.print("    ACT math?");
		int math = console.nextInt();
		System.out.print("    ACT reading?");
		int reading = console.nextInt();
		System.out.print("    SAT science?");
		int science = console.nextInt();
		double score = (2*math + reading + science + English)/1.8;
		System.out.printf("    exam score = " + "%.1f", score);
		System.out.println();
		return score;
	}
	public static double GPA(Scanner console){
		System.out.print("    overall GPA?");
		double over = console.nextDouble();
		System.out.print("    max GPA?");
		double max = console.nextDouble();
		System.out.print("    Transcript Multiplier?");
		double tran = console.nextDouble();
		double GPA = over/max*100*tran;
		System.out.printf("    GPA score = " + "%.1f", GPA);
		System.out.println();
		System.out.println();
		return GPA;
	}
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		compare(console);
	}
}
