package ObjectOrientedProgramming;

public class RocketShip {
	public static void line(int n){
		for(int i = 0; i < 4*n + 2; i++){
			if(i == 0 || i == 4*n + 1)
				System.out.print("+");
			else if(i % 2 == 0)
				System.out.print("*");
			else
				System.out.print("=");
			
		}
		System.out.println();
	}
public static void top(int n){
		for(int i = 0; i < 2*n - 1; i++){
			for(int j = 0; j < 2*n + 3 + i; j++){
				if(j < 2*n - i - 1)
					System.out.print(" ");
				else if(j == 2*n || j == 2*n + 1)
					System.out.print("*");
				else if( j < 2*n)
					System.out.print("/");
				else
					System.out.print("\\");
				}
			System.out.println();
			
		}
		
}
public static void body1(int n){
	for(int line = 0; line < n; line++){
	System.out.print("|");
	for(int dot = 1; dot < n - line; dot++){
		System.out.print(".");
		}
	for(int i = 1; i < line + 2; i++){
		System.out.print("/\\");
		}
    for(int dot = 1; dot < 2*(n - line) - 1; dot++){
		System.out.print(".");
		}
	for(int i = 1; i < line + 2; i++){
		System.out.print("/\\");
	}
	for(int dot = 1; dot < n - line; dot++){
	    System.out.print(".");
		}
	System.out.print("|");
	System.out.println();
	}
	}
public static void body2(int n){
	for(int line = n; line > 0; line--){
	System.out.print("|");
	for(int dot = 1; dot < n - line + 1; dot++){
		System.out.print(".");
		}
	for(int i = 1; i < line + 1; i++){
		System.out.print("\\/");
		}
    for(int dot = 1; dot < 2*(n - line) + 1; dot++){
		System.out.print(".");
		}
	for(int i = 1; i < line + 1; i++){
		System.out.print("\\/");
	}
	for(int dot = 1; dot < n - line + 1; dot++){
	    System.out.print(".");
		}
	System.out.print("|");
	System.out.println();
	}
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		top(num);
		line(num);
		body1(num);
		body2(num);
		line(num);
		body2(num);
		body1(num);
		line(num);
		top(num);
		// TODO Auto-generated method stub

	}

}
