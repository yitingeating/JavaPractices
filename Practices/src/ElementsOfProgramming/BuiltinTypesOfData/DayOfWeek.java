package ElementsOfProgramming.BuiltinTypesOfData;

public class DayOfWeek {

	public static void main(String[] args) {
		int date[] = {2017,1,21};
		int y = date[0];
		int m = date[1];
		int d = date[2];
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        System.out.print(d0);
		// TODO Auto-generated method stub

	}

}
