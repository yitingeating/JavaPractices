package ObjectOrientedProgramming;

import java.util.*;

public class TestCheckBalance2 {
	
	public static void state() {
		System.out.println("Welcome to the Balance Checking program");
		System.out.println();
	}
	
	public static void deal(Scanner console) {
		System.out.println("Enter the string you wish to check: ");
		String input = console.nextLine();
		CheckBalance2 in = new CheckBalance2(input);
		boolean balance = in.balanced();
		if (balance == true) {
			System.out.println("The string is balanced!");
		    System.out.println();
		}
		else {
			System.out.println("The string is unbalanced:");
		    System.out.println();
		    System.out.println(input);
		    int index2 = in.index();
		    for (int i = 0; i <index2; i++) {
		    System.out.print(" ");
		    }
		    System.out.println("^");
		    
		}
		int index2 = in.index();
	}
	
	public static boolean goon(Scanner console) {
		System.out.print("More?");
		String choice = console.next();
		if (choice.equals("yes")) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		state();
		//System.out.println("Enter the string you wish to check: ");
		Scanner console = new Scanner(System.in);
		deal(console);
		while(goon(console)){
			console = new Scanner(System.in);
			deal(console);
		}
		// TODO Auto-generated method stub

	}

}
