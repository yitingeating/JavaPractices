package studio1;

import cse131.ArgsProcessor;


public class Average {
	public static void main(String []args ){
		ArgsProcessor ap=new ArgsProcessor(args);
		int num1=ap.nextInt("enter the first number");
		int num2=ap.nextInt("enter the second number");
		double dnum1=num1;
		double dnum2=num2;
		double numAve=(dnum1+dnum2)/2;
		System.out.println("The average number of "+num1+" and "+num2+" is "+numAve);
	}
}
