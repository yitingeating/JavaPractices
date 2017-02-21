package ObjectOrientedProgramming;

//import java.util.*;

public class SimpleDate {

	private int mon;
	private int day;
	public static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public SimpleDate (int m, int d) {
		mon = m;
		day = d;
	}

	public SimpleDate (SimpleDate date) {
		mon = date.mon;
		day = date.day;
	}

	public int getMonth() {
		return mon;
	}

	public int getDay() {
		return day;
	}
	public String toString() {
		return mon + "/" + day;
		//System.out.print
	}

	public boolean equals(SimpleDate d) {
		// mon = d.getMonth();
		//day = d.getDay();
		if (mon == d.getMonth() && day == d.getDay()) {
			return true;  
		}
		else 
			return false;  
	}

	public int daysInMonth() {
		return days[mon - 1];
	}

	public void nextDay() {
		if ((day == 31) && (mon != 12) || (day == 28 && mon == 2)) {
			day = 1;
			mon++;
		}
		if (day == 30 && (mon == 4 || mon == 6 || mon == 9 || mon == 11)) {
			day = 1;
			mon++;
		}
		if (day == 31 && mon == 12) {
			day = 1;
			mon = 1;
		}
		else {
			day++;
		}
	}

	public static void state() {
		System.out.println("Birthday counter");
		System.out.println();
	}


}

