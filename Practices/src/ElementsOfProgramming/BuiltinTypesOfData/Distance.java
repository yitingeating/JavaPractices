package ElementsOfProgramming.BuiltinTypesOfData;

public class Distance {

	public static void main(String[] args) {
		//get inputs from command line, rick click on the java file and click on Run as -> Run Configuration
		//switch to Arguments tab and input two variables separated with a space under Programming Argumets
		int x = Integer.valueOf(args[0]);
        int y = Integer.valueOf(args[1]);
        double dist = Math.sqrt(x * x + y * y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		// TODO Auto-generated method stub

	}

}
