package ElementsOfProgramming.BuiltinTypesOfData;


public class SpringSeason {

	public static void main(String[] args) {
		int date[] = {6,2};
		int month = date[0];
		int day = date[1];
		boolean spring = (month==3&&day>=20)
				||(month==4)
				||(month==5)
				||(month==6&&day<=20);
		System.out.println(spring);
		// TODO Auto-generated method stub

	}

}
