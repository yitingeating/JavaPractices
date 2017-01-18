package eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		
		while (!StdDraw.mousePressed()) {
		    // do nothing, 
		    // we are waiting for the mouse button to go down  
		    if(StdDraw.mousePressed())
		    {
		    	System.out.println(StdDraw.mouseX());
		    }
		   
		    // The line below is important, as described below
		    //
		    StdDraw.show(50);
		}
		System.out.println(StdDraw.mouseX());
		
		
	}

}
