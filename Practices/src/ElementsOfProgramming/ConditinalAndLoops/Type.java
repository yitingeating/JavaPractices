package ElementsOfProgramming.ConditinalAndLoops;

public class Type {

	public static void main(String[] args) {
		int ascII =  Integer.parseInt(args[0]);
		if (ascII > 96 && ascII < 123)
			System.out.print("Ð¡Ð´×ÖÄ¸");
		else if (ascII > 64 && ascII < 90)
			System.out.print("´óÐ´×ÖÄ¸");
		else if (ascII > 47 && ascII < 57)
			System.out.print("Êý×Ö");
		else
			System.out.print("ºÇºÇ");
				
		// TODO Auto-generated method stub

	}

}
