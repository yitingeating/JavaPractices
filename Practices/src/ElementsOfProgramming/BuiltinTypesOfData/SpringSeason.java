package ElementsOfProgramming.BuiltinTypesOfData;


public class SpringSeason {

	public static void main(String[] args) {
		int month = Integer.valueOf(args[0]);
		int day = Integer.valueOf(args[1]);
		boolean spring = (month == 3 && day >= 20)
				||(month == 4)
				||(month == 5)
				||(month == 6 && day <= 20);
		System.out.println(spring);
		// TODO Auto-generated method stub

	}

}
