package lines;

import sedgewick.StdDraw;

public class Lines {

	/**
	 * 
	 * @param x1 x coordinate of starting point
	 * @param y1 y coordinate of starting point
	 * @param x2 x coordinate of ending point
	 * @param y2 y coordinate of ending point
	 */
	public static void drawLine(double x1, double y1, double x2, double y2) {
		// FIXME -- fill in this method according to the instructions
		if(Math.abs(x1-x2)<=0.001&&(Math.abs(y1-y2)<=0.001))
		return;
		double midX=0.5*(x1+x2);
		double midY=0.5*(y1+y2);
		StdDraw.point(midX, midY);
		drawLine(x1,y1,midX,midY);
		drawLine(midX,midY,x2,y2);
	}
	
	
	/**
	 * Code to test the drawLine method visually
	 */
	public static void main(String[] args) {
		
		//
		// Test the drawing program
		//
		//StdDraw.setXscale(0,1);
       // StdDraw.setYscale(0,1);
       
		drawLine(0,0,1,1); // lower left to upper right
		System.out.println("done drawing1");
		drawLine(0,1,1,0); // upper left to lower right
		System.out.println("done drawing2");
		
		
		//
		// Draw rectangles of decreasing width and height
		//
		drawLine(0.25,0.25,0.75,0.75);
		for (double r = 0.25; r < 0.5; r = r+.005) {
			double s = 1-r;
			drawLine(r,r, r, s);
			drawLine(r, s, s, s);
			drawLine(s, s, s, r);
			drawLine(s, r, r, r);
		}
		System.out.println("done drawing");
	}

}
