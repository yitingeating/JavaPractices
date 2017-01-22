package ElementsOfProgramming.BuiltinTypesOfData;

public class RGBtoYIQ {
	public static void main(String[] args) {
		int R = 0;
		int G = 0;
		int B = 255;
		double Y = 0.299 * R + 0.587 * G + 0.114 * B;
		double I = 0.596 * R - 0.275 * G - 0.321 * B;
		double Q = 0.212 * R - 0.523 * G + 0.311 * B;
		System.out.println("(" + R + "," + G +"," + B + ")" + "->" + "(" + Y + "," + I + "," + Q + ")"); 
		
		//Another method to build up a complicated String: using String.format();
		// String.format() is a strange method, the first parameter will always be a String which servers 
		// as a template, but, after that you can have variable number of parameters. 
		// after the method run, the substring %s will be replaced by the parameters with certain order.
		System.out.println(String.format("(%s, %s, %s) -> (%s, %s, %s)", R, G, B, Y, I, Q));
		// TODO Auto-generated method stub

	}
}
