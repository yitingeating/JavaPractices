package IO;
import java.awt.*;
import java.util.*;
import java.io.*;

public class RainfallPlotter {
	
	public static final String PATH = "C:\\sliu\\JavaPractices\\Practices\\src\\IO\\rainfall.txt";
	public static final String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		// Variables Declaration
		Scanner console = new Scanner(System.in);
		Scanner inputData = new Scanner(new File(PATH));
		Graphics g;
		String cities[];
		Color colors[] = {Color.red,Color.blue,Color.green};
		int cityCnt = 0;
		
		//main process
		introduction();
		cities = getCities(console);
		g=initGrid();
		while(cityCnt<=2 && !cities[cityCnt].equals("stop")){
			drawOneCity(cities[cityCnt],colors[cityCnt],g,inputData,cityCnt);
			cityCnt++;
			inputData.close();
			inputData = new Scanner(new File(PATH));
		}
		
		//close
		console.close();
		inputData.close();

	}
	
	public static void introduction(){
		System.out.println("Welcome to the Rainfall Plotter program!");
		System.out.println("You can plot the rainfall for up to 3 cities.");
		System.out.println("You can stop plotting by entering 'stop' as the name of the city.");
	}
	
	public static String[] getCities(Scanner Console){
		String cities[] = new String[3];
		for(int i=1;i<=3;i++){
			System.out.print("city?" );
			String input = Console.next();
			if(input.equals("stop")){
				cities[i-1] = "stop";
				break;
			}
			else
				cities[i-1] = input;
		}
		System.out.println("Thank you for using the Rainfall Plotter program!");
		return cities;
	}
	
	public static Graphics initGrid(){
		DrawingPanel panel = new DrawingPanel(840, 550);
		Graphics g = panel.getGraphics();
		g.drawLine(0, 25, 840, 25);
		g.drawLine(0, 525, 840, 525);
		for(int i=1;i<=12;i++){
			g.drawLine(70*i, 25, 70*i, 550);
			g.drawString(MONTHS[i-1], 70*(i-1)+5, 550-5);
		}
		return g;
	}
	
	public static void drawOneCity(String city,Color color,Graphics g,Scanner inputData, int cityCnt){
		double data[] = getData(city,inputData);
		g.setColor(color);
		g.drawString(city,100*cityCnt+2,23);
		for(int i=0;i<11;i++){
			g.drawLine(70*i,getY(data[i]),70*(i+1),getY(data[i+1]));
			g.drawString(Double.toString(data[i]), 70*i+2, getY(data[i]));
		}
		
	}
	
	public static double[] getData(String city, Scanner inputData){
		double result[] = new double[12];
		result[0] = -1;
		while ( inputData.hasNextLine() ) {
			String line = inputData.nextLine();
			if(line.contains(city.toLowerCase())){
				Scanner inputLine = new Scanner(line);
				inputLine.next();
				for(int i=0;i<=11;i++)
					result[i] = inputLine.nextDouble();
				inputLine.close();
			}
		}
		if(result[0]<0)
			System.out.println(city + " : city not exist!");
		return result;
	}
	
	public static int getY(double data){
		return (int)Math.rint(550-25-data/150*500);
	}

}
