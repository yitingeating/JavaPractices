package ElementsOfProgramming.ConditinalAndLoops;

public class Harricane {

	//well done
	public static void main(String[] args) {
		int windSpeed = Integer.parseInt(args[0]);
		if (windSpeed < 74)
		System.out.print("It's not harricane");
		else if (windSpeed < 96)
			System.out.print("level 1");
		else if (windSpeed < 111)
			System.out.print("level 2");
		else if (windSpeed < 131)
			System.out.print("level 3");
		else if (windSpeed < 155)
			System.out.print("level 4");
		else 
			System.out.print("level 5");
		
		// TODO Auto-generated method stub

	}

}
