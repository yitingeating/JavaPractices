package ElementsOfProgramming.ConditinalAndLoops;

public class Median {

	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = 3;
		num[1] = 1;
		num[2] = 5;
		num[3] = 9;
		num[4] = 0;
		int i = 0,j = 0, k = 0;
		for (i = 0;i < 5;i++)
		{
			for(int l = 0;l < 5;l++)
			{
				if (num[i]<num[l])
					j +=1;
				else if (num[i] == num[l])
					k +=0;
				else k +=1;
			}
			if (j == k)
				break;
		}
		System.out.print(num[i]);
		// TODO Auto-generated method stub

	}

}
