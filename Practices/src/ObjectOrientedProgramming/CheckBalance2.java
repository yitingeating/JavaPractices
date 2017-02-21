package ObjectOrientedProgramming;

//import java.util.*;

public class CheckBalance2 {
	private String input;
	public static String sym = "({[<)}]>";
	private boolean bal;
	private int index1;
	
	public CheckBalance2 (String input) {
		//boolean ban;
		ArrayStack compare = new ArrayStack();
		//char symbol = input.charAt(0);
		//int index1 = 0;
		for (int i = 0; i < input.length(); i++) {
		char symbol = input.charAt(i);
		if (symbol == '(' || symbol == '{' || symbol == '<' || symbol == '[') {
				compare.push(symbol);     
		}
		else if (symbol == ')' || symbol == '}' || symbol == '>' || symbol == ']') {
			if (compare.isEmpty()) {
				bal = false;
				index1 = i;
			    break;
			}
			else {
				 int j = 4;
				 while (symbol != sym.charAt(j)) {
					j++;
				}
				if (compare.peek() == sym.charAt(j-4)) {
					compare.pop();
				}
				else {
					bal = false;
					index1 = i;
				    break;
				}
					
			}
		}
		index1 = i;
	}
		if (index1 != 0)
		bal = compare.isEmpty();
		if (bal)
			index1 = input.length();
	}
	public boolean balanced () {
	 return bal;
	}
	public int index() {
	return index1;
		}
		

}
