package ElementsOfProgramming.ConditinalAndLoops;

public class Type {

	public static void main(String[] args) {
		int ascII =  Integer.parseInt(args[0]);
		if (ascII > 96 && ascII < 123)
			System.out.print("Сд��ĸ");
		else if (ascII > 64 && ascII < 90)
			System.out.print("��д��ĸ");
		else if (ascII > 47 && ascII < 57)
			System.out.print("����");
		else
			System.out.print("�Ǻ�");
				
		// TODO Auto-generated method stub

	}

}
