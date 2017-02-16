package IO;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rainfall {
	
	public static final String PATH = "C:\\sliu\\JavaPractices\\Practices\\src\\IO\\rainfall.txt";
	public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String END = "stop";
	public static final Color[] COLORS = {Color.red, Color.blue, Color.green};
	public static final int HORIZONTAL_INTERVAL = 100;
	public static final int HEIGHT = 550;
	public static final int WIDTH = 1200;
	public static final int SIDE_INTERVAL = 25;

	public static void state() {
		System.out.println("Welcome to the Rainfall Plotter program!");
		System.out.println("You can plot the rainfall for up to 3 cities.");
		System.out.println("You can stop plotting by entering 'stop' as the name of the city.");
	}

	public static String[] getCities(Scanner console) {
		String[] cities = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("city?");
			String city = console.next();
			if (END.equals(city)) break;
			else cities[i] = city;
		}
		return cities;
	}

/*	public static double[] getNums(String input, Scanner file) {//throws FileNotFoundException {
		double[] nums = new double[12];
		while (file.hasNextLine()) {
			String line = file.nextLine();
			String city = line2.next();
			nums[0] = 0.0;
			if (city.equals(input)) {
				for (int i = 0; i < 12; i++) {
					nums[i] = line2.nextDouble();
				}
				System.out.println(nums);
				break;
			}
		}
		if (nums[0] == 0.0) {
			System.out.println("Not found");
		}
		return nums;
	}*/

/*	public static void deal(String[] cities, Scanner file, Scanner console) {
		for (int i = 0; i < 3; i++) {
			String city = cities[i];
			if (city != null && !city.isEmpty() && !END.equals(city)) {
				drawCity(city, file);				
			}
		}
	}*/
	
	public static void drawCities(String[] cities, Scanner file, Graphics graphic) {
		boolean[] foundCity = new boolean[3];
		
		while (file.hasNextLine()) {
			String line = file.nextLine();
			Scanner lineScanner = new Scanner(line);
			
			String cityInFile = lineScanner.next();
			for (int i = 0; i < 3; i++) {
				if (cityInFile.equals(cities[i])) {
					foundCity[i] = true;
					
					int j = 0;
					double[] data = new double[12];
					while(lineScanner.hasNext()) {
						double point = lineScanner.nextDouble();
						data[j++] = point;
					}
					
					drawCity(data, cities[i], i, graphic);
				}
			}
			
			lineScanner.close();
		}
		
		for (int i = 0; i < 3; i++) {
			if (!foundCity[i] && cities[i] != null) {
				System.out.println(cities[i] + " not found");
			}
		}	
	}
	
	public static void drawCity(double[] data, String city, int cityNbr, Graphics graphic) {
		Color color = COLORS[cityNbr];
		graphic.setColor(color);
		
		graphic.drawString(city, cityNbr * HORIZONTAL_INTERVAL + 10, SIDE_INTERVAL - 3);
		for (int i = 1; i < 12; i++) {
			graphic.drawLine(HORIZONTAL_INTERVAL * (i - 1), calcHeight(data[i - 1]), HORIZONTAL_INTERVAL * i, calcHeight(data[i]));
			graphic.drawString(data[i] + "", HORIZONTAL_INTERVAL * i, calcHeight(data[i]));
		}
	}
	
	public static int calcHeight(double y) {
		return (int) Math.round(HEIGHT - SIDE_INTERVAL - y / 150 * (HEIGHT - 2 * SIDE_INTERVAL));
	}
	
	public static Graphics drawCanvas() {
		DrawingPanel canvas = new DrawingPanel(1200, HEIGHT);
		Graphics graphic = canvas.getGraphics();
		graphic.drawLine(0, SIDE_INTERVAL, WIDTH, SIDE_INTERVAL);
		graphic.drawLine(0, HEIGHT - SIDE_INTERVAL, WIDTH, HEIGHT - SIDE_INTERVAL);
		for(int i = 1; i <= 12; i++){
			graphic.drawLine(HORIZONTAL_INTERVAL * i, 25, HORIZONTAL_INTERVAL * i, HEIGHT);
			graphic.drawString(MONTHS[i-1], HORIZONTAL_INTERVAL * (i-1) + 5, HEIGHT - 5);
		}
		return graphic;
	}

	public static void main(String[] srgs) {
		state();
		Graphics graphic = drawCanvas();
		Scanner file;
		try {
			file = new Scanner(new File(PATH));
			Scanner console = new Scanner(System.in);
			drawCities(getCities(console), file, graphic);
			
			console.close();
			file.close();
			System.out.println("Thank you for using the Rainfall Plotter program!");
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found. " + e.getMessage());
		}
	}

}
