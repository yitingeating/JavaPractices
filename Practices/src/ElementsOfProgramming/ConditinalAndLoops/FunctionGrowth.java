package ElementsOfProgramming.ConditinalAndLoops;

public class FunctionGrowth {

	public static void main(String[] args) {
		System.out.println("lnn \tn \tnlnn \tn^2 \tn^3 \t2^n");
		int n  = 16; //跑这个程序，然后你会发现打印中出现了一个0，想想为什么
		while (n <= 2048){ //if,while,for这些关键字和后面的小括号要加一个空格，小括号的右括号和花括号的左括号要加一个空格
			System.out.print((int)Math.log(n));
			System.out.print('\t');
			System.out.print(n);
			System.out.print('\t');
			System.out.print((int)(n*Math.log(n)));
			System.out.print('\t');
			System.out.print(n*n);
			System.out.print('\t');
			System.out.print(n*n*n);
			System.out.print('\t');
			System.out.println((int)Math.pow(2, n));
			n *= 2; //这里有个更常见的写法就是 *=，同理还有+=, -=, /=, 等
			//n = n*2;
		}
		// TODO Auto-generated method stub

	}

}
