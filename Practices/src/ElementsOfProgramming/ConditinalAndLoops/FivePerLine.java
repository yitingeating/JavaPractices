package ElementsOfProgramming.ConditinalAndLoops;

public class FivePerLine {

	public static void main(String[] args) {
		for (int n = 1000; n < 2001; n++){ //循环语句的iterator初始化一般不放在外边，用花括号括起来
			if (n % 5 == 0) {//你的方法很聪明，但有更好的方法. %表示取余。例如n % 2 == 0就是判断n是否是偶数
				System.out.println(); //根据题目要求，这里不需要打印n本身				
			}  //一般来说，else紧跟在if的右括号后面，空格隔开. 
			//实际上在这里我不需要用else语句，判断n是否是5的倍数只决定我是否打印一个空行
			//但无论我是不是5的倍数，我都需要打印这个数，所以打印n的语句被放到了if block外面
			System.out.print(n + " ");
			
		}
		// TODO Auto-generated method stub

	}
	
/*	public static void main(String[] args) {
		int n = 1000; 
		for (n = 1000;n < 2001;n++)
			{if ((n+1)/5 == (n+1)/5.0)
		System.out.println(n);
		else System.out.print(n + " ");}
		// TODO Auto-generated method stub

	}*/

}
