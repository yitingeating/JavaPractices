//// Name:Shiyao Liu
//the class offers a recursive methods to create the pattern on the website


package lab6;
import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class Triangles {
	public static void main(String []args){
		ArgsProcessor ap = new ArgsProcessor(args);
    	int iteration = ap.nextInt("iteration times:");
	  	StdDraw.setXscale(0,2);
        StdDraw.setYscale(0,1);//set the scale of the canvas,making caluculation more easier
        
		double []x=new double[]{0,1,2};
		double []y=new double[]{0,0.5*Math.sqrt(3),0};
		StdDraw.filledPolygon(x, y);  //draw the black filled triangle
		StdDraw.setPenColor(StdDraw.WHITE);  //change the color from black to white
	   draw(iteration,x,y);
		
	
	}
	
	
	
	/**
	 * This method will draw the pattern on the website
	 * @param n:the times used for recursion, when it reaches 0, ends
	 * @param x:an array storing the three vertices of the triangles, x-coordinates
	 * @param y:an array storing the three vertices of the triangles, y-coordinates
	 */
	public static void draw(int n,double []x,double []y){
		StdDraw.setPenColor(StdDraw.WHITE);
		if(n==0)return;  //if the iteration goes to 0, stop
		
		double []xDiv=new double[]{x[0]+0.25*(x[2]-x[0]),x[0]+0.5*(x[2]-x[0]),x[0]+0.75*(x[2]-x[0])};
		double []yDiv=new double[]{y[0]+0.5*(y[1]-y[0]),y[0],y[0]+0.5*(y[1]-y[0])};//xDiv and yDiv are the central, inverse triangles
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledPolygon(xDiv,yDiv);//draw this inverse triangle
		//store all the other three triangles in arrays
		double []xUpper=new double[]{xDiv[0],x[1],xDiv[2]};
		double []yUpper=new double[]{yDiv[0],y[1],yDiv[2]};
		double []xLeft= new double[]{x[0],xDiv[0],x[1]};
		double []yLeft= new double[]{y[0],yDiv[0],y[1]};
		double []xRight=new double[]{xDiv[1],xDiv[2],x[2]};
		double []yRight=new double[]{yDiv[1],yDiv[2],y[2]};
		//call the function itself, wich decreasing n
		draw(n-1,xRight,yRight);
		draw(n-1,xUpper,yUpper);  
		draw(n-1,xLeft,yLeft);
		
		
	}
}

