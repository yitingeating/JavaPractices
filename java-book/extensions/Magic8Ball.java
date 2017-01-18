import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Magic8Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledCircle(0.5, 0.5, 0.4);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.circle(0.5, 0.5,0.25);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		while(true){
			ArgsProcessor ap=new ArgsProcessor(args);
			String question=ap.nextString("your question is?");
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.setPenRadius(0.1);
			StdDraw.text(0.5, 0.5, "yes");
			StdDraw.setPenRadius();
			StdDraw.text(0.5, 0.45, "yes");
			
			
			
			
		}

	}

}
