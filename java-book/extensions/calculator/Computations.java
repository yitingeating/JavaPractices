package calculator;

public class Computations {
	
	
	/**Double operators**/
	//Return the result of adding d1 and d2.
	static double addDoubles(double d1, double d2) {
		double ans = d1 + d2;
		return ans;
	}
	
	//Return the result of subtracting d2 from d1.
	static double subtractDoubles(double d1, double d2) {
		double ans = d1 - d2;  // FIXME
		return ans;
	}
	
	//Return the result of dividing d1 by d2.
	static double divideDoubles(double d1, double d2) {
		double ans = d1/d2;  // FIXME
		return ans;
	}
	
	//Return the result of multiplying d1 and d2.
	static double multiplyDoubles(double d1, double d2) {
		double ans = d1*d2;  
		return ans;
	}
	
	
	
	/**Int operators**/

	//Return the result of adding i1 and i2.
	static int addInts(int i1, int i2) {
		int ans = i1+i2; // FIXME
		return ans;
	}
	

	//Return the result of subtracting i2 from i1.
	static int subtractInts(int i1, int i2) {
		int ans = i1-i2; // FIXME
		return ans;
	}
	
	//Return the result of dividing i1 by i2.
	static int divideInts(int i1, int i2) {
		int ans = i1/i2; // FIXME
		return ans;
	}
	
	//Return the result of multiplying i1 and i2.
	static int multiplyInts(int i1, int i2) {
		int ans = i1*i2; // FIXME
		return ans;
	}
	
	
	
	/**String operators**/	
	//	//Return the result of concatenating s2 to s1.
	static String concatenate(String s1, String s2) {
		return s1+s2;  // FIXME
	}
	
	
	
	/**Boolean operators**/
	//Return the boolean value that results from an AND operation of b1 and b2
	static boolean andBoolean(boolean b1, boolean b2) {
		return b1&&b2;  // FIXME
	}
	//Return the boolean value that results from an OR operation of b1 and b2
	static boolean orBoolean(boolean b1, boolean b2) {
		return b1||b2;  // FIXME
	}
	
	/**Casting to int**/
	static int intToint(int in) {
		return in; // FIXME Auto-generated method stub
	}
	static int doubleToint(double in) {
		return (int)in;  // FIXME
	}
	static int stringToint(String in) {
		int i=Integer.parseInt(in);
		return i;  
	}
	static int booleanToint(boolean in) {
	
    return (in==true?1:0);  // FIXME
	}
	
	
	/**Casting to double**/
	static double intTodouble(int in) {
		return (double)in;  // FIXME
	}
	static double doubleTodouble(double in) {
		return in; 
	}
	static double stringTodouble(String in) {
		return Double.parseDouble(in);  // FIXME
	}
	static double booleanTodouble(boolean in) {
		return in==true?1:0;  // FIXME
	}
	
	
	/**Casting to String**/
	static String intToString(int in) {
		return String.valueOf(in);  // FIXME
	}
	static String doubleToString(double in) {
		return String.valueOf(in);  // FIXME
	}
	static String stringToString(String in) {
		return in;  // FIXME
	}
	static String booleanToString(boolean in) {
		return in==true?"true":"false";  // FIXME
	}
	
	
	/**Casting to Boolean**/
	static boolean intToboolean(int in) {
		if( in==1)
			return true;
		else if(in==0)
			return false;
		else 
		{error();return false;}
  	}
	static boolean doubleToboolean(double in) {
		if( in==1)
			return true;
		else if(in==0)
			return false;
		else 
		{error();return false;}  // FIXME
	}
	static boolean stringToboolean(String in) {
		if(in.equals(true))
			return true;
		else if(in.equals(false))
			return false;
		else
		{error();return false;} // FIXME
	}
	static boolean booleanToboolean(boolean in) {
		return in;  // FIXME
	}
	
	/**Error method**/
	//Call this when an operation is not possible, or doesn't make sense.  
	//Ex. Casting a string to boolean, casting a double to boolean.
	public static void error(){
		Calculator.calculator.errorDisplay("This operation is not possible.");
	}
}
