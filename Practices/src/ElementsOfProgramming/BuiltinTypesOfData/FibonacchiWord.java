package ElementsOfProgramming.BuiltinTypesOfData;

public class FibonacchiWord {
	public static void main(String[] args) {
		/* No, the variable name and method name should always start from a lower case character.
		 * please goahead and learn the CamelCase. 
		String F[] = new String[10];
	    */
/*		
	    F[0] = "a";
	    F[1] = "b";
	    System.out.println(F[0]);
	    System.out.println(F[1]);
	    for (int i = 2; i < 10; i++)
	    	F[i] = F[i-1] + F[i-2];
	    for (int j = 2; j < 10; j++)
	        System.out.println(F[j]);
	    */
	
	    int n = 10;
	    //in java, when you declare an array, always put the bracket [] right after the datatype.
	    // String strs[] is not an regular way to write, 
	    // you should write as String[] strs.
	    String[] strs = new String[n];
		// TODO Auto-generated method stub
	    strs[0] = "a";
	    strs[1] = "b";
	    
	    for (int i = 2; i < n; i++) {
	    	strs[i] = strs[i - 2] + strs[i - 1];
	    }
	    
	    // This is a convinient way to write a loop. 
	    // This kind of statement doesn't really matter the performance, but it's convenient for developers.
	    // We called these stuff: Syntax Sugar.
	    // If you don't need the index information, like the i, you can write it this way.
	    for (String str : strs) {
	    	System.out.println(str);
	    }
	}
}
