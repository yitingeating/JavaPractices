package ElementsOfProgramming.BuiltinTypesOfData;

public class Swap {

	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		int c = 0;
		System.out.println("a = " + a + "," + "b = " + b +"," + "c = " + c);
		
		// Wrong answer: 
		// initially, a = 3, b = 9, c = 0
		// after first statement: c = a, they will be a = 3, b = 9, c = 3
		// after second one: a = 9, b = 9, c = 3
		// after thrid one: a = 9, b = 3, c = 3
		// please notice that when you assign b = c, c is no longer 0, because it has been already assigned value from a. 
		// The value 0 will no longer be persistent.
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + "," + "b = " + b +"," + "c = " + c);
		// TODO Auto-generated method stub
		
		//corrent answer: you have to assign another variable to hold the value of c.
		a = 3;
		b = 9;
		c = 0;
		int tmp = c;
		c = a;
		a = b;
		b = tmp;
		System.out.println("a = " + a + "," + "b = " + b +"," + "c = " + c);
		
		//how to make the variables no long from hard code, but from command line input?
		int commandLineInputA = Integer.valueOf(args[0]);
		
		//there are two methods to convert a String to a integer if possible"
		// a. int number = Integer.valueOf(numStr);
		// b. int number = Integer.parseInt(numStr);
		int commandLineInputB = Integer.valueOf(args[1]); 
		
		// when you want to run this type of java app, right click on the .java file and click on 'Run as' -> 'Run Configuration'
		// -> switch to 'Arguments' tab on the right panel. Inside the 'Programming Variable' text area, type the two inputs variable 
		// separated by space. Please notice that these varibales will build up the string array. So you might need to convert
		// the data type from string to whatever you want.
		
		int commandLineTmp = commandLineInputA;
		commandLineInputA = commandLineInputB;
		commandLineInputB = commandLineTmp;
		System.out.println(String.format("arg A is now: %s an arg B is now: %s", commandLineInputA, commandLineInputB));
	}

}
