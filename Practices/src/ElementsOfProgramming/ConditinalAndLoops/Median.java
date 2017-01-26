package ElementsOfProgramming.ConditinalAndLoops;

public class Median {

	public static void main(String[] args) {
		//这个答案是错误的, 跑下面这个数据结果是不对的
		int num[] = new int[5];
		num[0] = 0;
		num[1] = 1;
		num[2] = 4;
		num[3] = 2;
		num[4] = 7;
		int i = 0,j = 0, k = 0;
		for (i = 0;i < 5;i++) {//关于花括号写法，不要参照教程里的
			for(int l = 0;l < 5;l++) {
				if (num[i]<num[l]){
					j += 1;
				}
				else if (num[i] == num[l]) {
					k += 0;
				}
				else {
					k += 1;
				}
			}
			if (j == k)
				break;
		}
		System.out.print(num[i]);
		// TODO Auto-generated method stub

	}

}
