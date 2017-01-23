package ElementsOfProgramming.ConditinalAndLoops;

public class Exp {
	//对于花括号来说，永远是左括号在行尾，右括号另起一行
	public static void main(String[] args) {
		double x = 3;
		double term = 1.0;
		double sum = 0.0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + term;
			term = term * (x / i); //乘法除法也要空格
		}

		System.out.println(sum);
	}
}


// TODO Auto-generated method stub


