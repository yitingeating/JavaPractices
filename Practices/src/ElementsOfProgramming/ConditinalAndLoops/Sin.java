package ElementsOfProgramming.ConditinalAndLoops;

public class Sin {

	public static void main(String[] args) {
		double x = 0;
		double sin = 0,cos = 0,term1 = 1,term2 = x;
		for(int i = 1;i <= 10;i++) {
			cos += term1;
			term1 *= (-x * x/((i + 1)*(i + 2)));
			term2 *= (-x * x/((i + 1)*(i + 2)));
			sin += term2;
			System.out.println(sin);
			System.out.println(cos);
		}

		/*for(int i = 1;i <= 10;i++) {{cos = cos + term1;
		term1 = term1*(-x*x/((i+1)*(i+2)));} //这个有一个花括号括起来的是不必要的
		term2 = term2*(-x*x/((i+1)*(i+2)));
		sin = sin + term2;
		}*/

		// TODO Auto-generated method stub

	}

}
