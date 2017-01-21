package ElementsOfProgramming.BuiltinTypesOfData;


public class States {

	public static void main(String[] args) {
		    double nums[] = new double[5]; // avoid using variable name like 'a' that doesn' make sense. 'nums', 'array' are some common variable name
		                                   // under this circumstance
		    double sum = 0.0;
		    double min = Double.MAX_VALUE;
		    double max = Double.MIN_VALUE;
		    //clean code: it's a best practice to always contain the bracket {} rather than not, because otherwise, only the first
		    // statement will be counted as part of the loop. for most of the time, you need mulitple statements inside the for loop
		    // Prof. Sedgewick put the first bracket at another new line, this is actually a C# style not a java style.
		    
	
		    for(int i = 0; i < 5; i++) {// always tab a space after any operator like + - * / and comma, semicolon 
		    	nums[i] = Math.random();
		    	System.out.println("the " + i + " number is: " + nums[i]);
		    	//better separate the code with a single line to separate different logic blocks.
		    	sum += nums[i];
		    	min = Math.min(min, nums[i]); //this is the common way to update a min/max value. You should never hard code
		    								// the index like  double min = Math.min(a[0],Math.min(a[1],Math.min(a[2],Math.min(a[3],a[4]))));
		    								// try use for loop and update it .
		    								// what if it's a 10000 long array, how could you hard code that way.
		    	max = Math.max(max, nums[i]);
		    }

		    double average = sum / 5;
		    System.out.println();
		    System.out.println(average);
		    System.out.println(min);
		    System.out.println(max);
		
			
		// TODO Auto-generated method stub

	}
	
/*	public static void main(String[] args) {
	    double a[] = new double[5];
	    for(int i = 0;i<5;i++)
		a[i] = Math.random();
	    for(int j = 0;j<5;j++)
	    System.out.println(a[j]);
	    double average = 0.0;
	    for(int k = 0;k<5;k++)
	    	average = average+a[k];
	    double min = Math.min(a[0],Math.min(a[1],Math.min(a[2],Math.min(a[3],a[4]))));
	    double max = Math.max(a[0],Math.max(a[1],Math.max(a[2],Math.max(a[3],a[4]))));
	    average = average/5;
	    System.out.println();
	    System.out.println(average);
	    System.out.println(min);
	    System.out.println(max);
	
		
	// TODO Auto-generated method stub

}*/

}
