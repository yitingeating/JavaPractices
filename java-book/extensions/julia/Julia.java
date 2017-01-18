package julia;

import java.awt.Color;

import sedgewick.StdDraw;

public class Julia {
	
	
	/**
	 * Remembers the width and height as instance variables, and establishes the default picture. See {@link reset() reset}
	 * @param width
	 * @param height
	 */
	public Julia(int width, int height) {
	}
	
	/**
	 * Establish the coordinates of the display to go from -2 - 2i at the lower-lefthand corner to 2 + 2i at the upper-right,
	 * and set the maximum number of iterations to 50.
	 */
	public void reset() {
	}
	
	/**
	 * Reset the display so that the supplied complex coordinates frame the lower left and upper right of what is seen.
	 * @param ll new lower-left coordinate for the displayed area
	 * @param ur new upper-right coordinate for the displayed area.
	 */
	public void setCoordinates(Complex ll, Complex ur) {
	}
	
	/**
	 * Zoom in to the area framed by 1/4 of the current display.
	 */
	public void zoomIn() {
	}
	
	/**
	 * Refresh the display by computing point by point the color value as described in the lab.
	 * It may be helpful to call StdDraw.show(0) before and after you are done, so that the display need not be
	 * update after each point is computed.
	 * It may also be helpful to fill the display with a white rectangle before computing and establishing the points' colors.
	 */
	public void draw() {
	}
	
	/**
	 *  Inverse of {@link zoomIn() zoomIn}:  as if the currently viewed display becomes framed by 1/4 of the new display all around.
	 */
	public void zoomOut() {
	}

	/**
	 * Increase the maximum number of iterations per point by 50.
	 */
	public void bump() {
	}

	/**
	 * Decrease the maximum number of iterations per point by 50, but make sure the result does not drop below 50.
	 */
	public void unbump() {
	}

}
