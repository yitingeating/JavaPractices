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
	}

}
