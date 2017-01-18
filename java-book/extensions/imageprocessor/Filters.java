package imageprocessor;
/**
 * Name: Jake Gordon
 * Lab Section: H
 * Date:9/13
 * ImageProcessor.java
 * CSE 131 Lab 1
 */

import java.awt.Color;



public class Filters {
	// Some sample methods:

	// This method cuts each color component of a pixel in half to produce the new image.
	public static int darker(int pixelComponent) {
		return pixelComponent/2;
	}

	// This method sums the color components of two pixels to produce a third.
	// Note that when the total exceeds 255, there is a strange effect.
	// USED IN: example_combine
	public static int combine(int pixelAComponent, int pixelBComponent) {
		return pixelAComponent+pixelBComponent;
	}

	// This method takes the color of each pixel and creates a new color without any green.  Returns an array of integers [r, g ,b].
	// USED IN: example_purplish
	public static Color purplish(Color c) {
		int r=c.getRed();
		int g=0;
		int b=c.getBlue();
		Color out=new Color(r,g,b);
		
		return out;  // FIXME
	}

	// Now that you've seen the examples, complete the following methods.
	// The headers have been completed for you.
	//
	// NB: The 'return 0' and 'return new Color(0,0,0)' lines are simply placeholders
	// to prevent the compiler from complaining.  They should be removed or modified when
	// you add your implementation.

	/**Complete the method called copy that copies
	 *the first source image to the target panel.  
	 *(Hint: This is a very simple method.)**/
	public static int copy(int pixelComponent) {
		return pixelComponent;  // FIXME
	}

	//This method averages the color components of two pixels.
	// USED IN: composite
	public static int composite(int a, int b) {
		return (a+b)/2;  // FIXME
	}

	//This method returns the negative of a pixel by inverting its color components.
	// USED IN: negative
	public static int negative(int a) {
		return 255-a;  // FIXME
	}

	//This method reduces the number of possible values for a given color component
	//from 256 to 2, by returning either 0 or 255 based on the original value.
	// USED IN: posterize
	public static int posterize(int a) {
		return 255*(a/128);   // FIXME
	}

	//This method returns a color that is brighter than the original color.
	// USED IN: brighter
	//FIX ME
	public static Color brighter(Color c) {
		
		return c.brighter(); // FIXME
	}

	//This method returns a color that is some shade of gray, by making a new
	//color having equal RGB components. returns an array of integers [r, g ,b].
	// USED IN: grayscale
	public static Color grayscale(Color c) {
		int r=c.getRed();
		int g=c.getGreen();
		int b=c.getBlue();
		int gray=(r+g+b)/3;
		Color res=new Color(gray,gray,gray);
		return res;  // FIXME
	}

	//This method returns either black or white, based on the intensity of the
	//originally provided color. returns an array of integers [r, g ,b].
	// USED IN: blackWhite
	public static Color blackAndWhite(Color c) {
		int r=c.getRed();
		int g=c.getGreen();
		int b=c.getBlue();
		int gray=(r+g+b)/3;
		gray=gray>127?255:0;
		Color res=new Color(gray,gray,gray);
		return res;   // FIXME
	}

	//This method combines two images by choosing for each location the brighter 
	//pixel in the same location from the two source images.
	// USED IN: combineBrighter
	public static Color combineBrighter(Color c1, Color c2) {
		int ica=c1.getRed()+c1.getGreen()+c1.getBlue();
		int icb=c2.getRed()+c2.getGreen()+c2.getBlue();
		
		
		return ica>=icb?c1:c2;  // FIXME


	}
	/**This is the beginning of another extension*
	 * 
	 * */

	//This method performs background subtraction by returning the color blue
	//if the two colors are close enough; otherwise, it returns the first color.
	public static Color bgSubtract(Color source1Color, Color source2Color) {
		int dblue=source1Color.getBlue()-source2Color.getBlue();
		int dred=source1Color.getRed()-source2Color.getRed();
		int dgreen=source1Color.getGreen()-source2Color.getGreen();
		dblue=Math.abs(dblue);
		dred=Math.abs(dred);
		dgreen=Math.abs(dgreen);
	    if((dblue<=20)&&(dred<=20)&&(dgreen<=20))
	    	return Color.blue;
	    else
		return source1Color;

	}

	//This method performs background replacement by returning the color from the
	//second image if the color from the first image is blue; otherwise returns
	//the color from the first image.
	public static Color bgReplace(Color s1Color, Color s2Color ) {
		int r=s1Color.getRed();
		int g=s1Color.getGreen();
		int b=s1Color.getBlue();
		if((r==0)&&(g==0)&&(b==255))
			return s2Color;
		else
		return s1Color;
	}

}
