package studio1;

import cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What's your name, guy A?");
		String s1 = ap.nextString("How about you ,guy B");
		String s2 = ap.nextString("And you..? C?");
		String s3 = ap.nextString("And you?");
		//
		// Say hello to the names in s0 through s3.
		//
      System.out.println("Hello "+s0+"!   "+"Hello "+s1+"!   "+"Hellow "+s2+"!   "+"Hello "+s3+"!  ");
	}
}
