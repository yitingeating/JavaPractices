package ElementsOfProgramming.BuiltinTypesOfData;


public class States {

	public static void main(String[] args) {
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

	}

}
