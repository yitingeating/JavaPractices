package ObjectOrientedProgramming;

import java.util.*;

public class ArrayStack {
	private ArrayList<Character> stack;
	public ArrayStack() {
		stack = new ArrayList<Character> ();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public char peek() {
		if (stack.isEmpty()) return ' ';
		else return stack.get(stack.size() - 1);
	}


	public void push(char c) {
		if (stack.size() < 1000) stack.add(c);
	}
	public char pop() {
		char top = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return top;
	}
}
