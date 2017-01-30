package Arrays;

public class Birthday {

	public static void main(String[] args) {
		int date[] = new int[365];
		int people [] = new int[365];
			for (int i = 0; i < 365; i++){
				date[i] = (int)(Math.random()*365);
				for (int j = 0; j < i; j++){
					if (date[i] == date[j]){
						people[i] = i + 1;
					    break;
					}
					    }
			}
					
	
		int sum = 0;
		for (int n = 0; n < 365; n++)
			sum += people[n]; 
			double ave = sum/365;
			System.out.print(people[1]);
		// TODO Auto-generated method stub

	}

}
