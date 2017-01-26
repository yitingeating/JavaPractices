package ElementsOfProgramming.ConditinalAndLoops;

public class CheckCharacter {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Input invalid");
			return;
		}
		
		char c = args[0].charAt(0); // This is how we get the nth character from a string: charAt(index)
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("This is lower case");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("This is upper case");
		} else  if (c >= '0' && c <= '9') { // key point: yes, the compiler won't complain if you put c >= 0 without the 
									         // quote like c >= 0 rather than c >= '0'. But the 0 there means 
											// the first character in  ASCii table, which isn't actually '0'. 
											// check the url and see the ASCII table http://www.asciitable.com/
			System.out.println("This is a digit");
		}
	}
}
