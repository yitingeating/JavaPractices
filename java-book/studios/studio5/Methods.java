package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static double avg3(int x,int y,int z){
		return (x+y+z)/3.0;
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static double sumArray(double []x){
		double sum = 0.0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		return sum;
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static double average(double []x){
		double sum=Methods.sumArray(x);
		return sum/(x.length);
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static String pig(String x){
		int n=x.length();
		return x.substring(1, n)+x.substring(0, 1)+"ay";
		
	}

	
	public static double multiply(double x,double y){
		return x*y;
		}
}
