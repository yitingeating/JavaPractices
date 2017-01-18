//Shiyao Liu, ID:437742
// the methods need to be tested for lab6
package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * function f, as the function on website
	 * @param x
	 * @return f
	 */
public static double f(double x){
	if(x>100)
		return x-10;
	else
		return f(f(x+11)); 
}


	
	/**
	 * return the exponential of two integers a and b;
	 * @param a
	 * @param b
	 * @return the exponential
	 */
	public static int expt(int a,int b){
		 if(b==0)
			 return 1;  //when the b decreases to 0, return 1
		 else 
			 return a*expt(a,b-1);   //multiply the function with decreasing b
	}
	

	/**
	 * Retrun whether a string is palindrome
	 * @param string, the string need to be tested
	 * @return 
	 */
	public static boolean isPalindrome(String string) {

		if (string.length()<=1)
			return true;
		else if (string.charAt(0) != string.charAt(string.length()-1)) //if the farest two points are not the same, return false
			return false;
		return isPalindrome(string.substring(1, string.length()-1));//substract the two end char
		
	}




	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		double ans=f(87);
		System.out.println(ans);

		System.out.println(expt(5,3));
		System.out.println(isPalindrome("raceuar"));
		System.out.println("racecar".substring(1,6));
	}

}
