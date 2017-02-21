package ObjectOrientedProgramming;

import java.util.*;

public class BirthdayDate { 

	public static void state() {
  	  System.out.println("Birthday counter");
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
		System.out.println("What is today's date (month and day)? ");
		int mon = console.nextInt();
  		int day = console.nextInt();
  		SimpleDate s1 = new SimpleDate(mon, day);
  		System.out.println("What is your birthday (month and day)?");
  		mon = console.nextInt();
  		day = console.nextInt();
  		SimpleDate s2 = new SimpleDate(mon, day);
  		System.out.println("There are " + s2.daysInMonth() + " days in month #" + s2.getMonth());
  		int i = 0;
  		while (!s1.equals(s2)) {
  			s1.nextDay();
  			i++;
  		}
  		System.out.println("Number of days until birthday " + s2.toString() + ": " + i);
  		System.out.print("More?");
  		System.out.println();
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

