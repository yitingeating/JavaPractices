package ObjectOrientedProgramming;

import java.util.Scanner;

public class TestFullDate { 

	public static void state() {
		System.out.println("day counter");
		System.out.println();
	}

	public static boolean con(Scanner console) {
		String res = console.next();
		if (res.equals("yes"))
			return true;
		else 
			return false;
	}

	public static void start(Scanner console) {
		//state();
		System.out.println("Enter first date (y m d):");
		int year = console.nextInt();
		int mon = console.nextInt();
		int day = console.nextInt();
		FullDate s1 = new FullDate(year, mon, day);
		System.out.println("Enter second date (y m d):");
		year = console.nextInt();
		mon = console.nextInt();
		day = console.nextInt();
		FullDate s2 = new FullDate(year, mon, day);
		if (s2.lessOrEqual(s1)) {
			String s = s1.toString();
			int i = 0;
			while (!s2.equals(s1)) {
				s2.nextDay();
				i++;
			}
			System.out.println("There are " + i + " days between " + s + " " + s1.toString());
		}
		else {
			String s = s1.toString();
			int i = 0;
			while (!s1.equals(s2)) {
				s1.nextDay();
				i++;
			}
			System.out.println("There are " + i + " days between " + s + " " + s2.toString());
		}
		System.out.println();
		System.out.print("More?");
	}


	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//Scanner console2 = new Scanner(System.in);
		state();
		start(console);
		while (con(console)){
			start(console);
		}
	}
}

