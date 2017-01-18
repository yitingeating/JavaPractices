package matrix;


public class Matrix {
	
	private double[][] values;
	
	
	/**
	 * The Matrix is based on the supplied two-dimensional array of values.
	 * Be sure to make your own copy of the values, so that changes to the
	 *    array outside of this class do not affect your work.
	 * @param values
	 */
	public Matrix(double[][] in) {
		//values = in;  // FIXME -- make a copy!
		int raw=in.length;
		int col=in[0].length;
		double [][]copy=new double[raw][col];
		 for(int i=0;i<in.length;i++)
			 for(int j=0;j<in[0].length;j++)
				 copy[i][j]=in[i][j];
		 values=copy;
		//values=copy;
		
	}
	
	/**
	 * You must complete this method, or the equals(Object) test will always
	 *   return false. 
	 * Arrays one and two are considered
	 * equal if and only if:
	 *   1) They have the same shape (number of rows and columns agree)
	 *   2) The contents of the two arrays are the same, element by element
	 * @param one
	 * @param two
	 * @return true iff the arrays have the same shape and contents
	 */
	private static boolean arraysAreEqual(double[][] one, double[][] two) {
		boolean judge=true;
		if(one.length!=two.length||one[0].length!=two[0].length)
		judge=false;
		else
		for(int i=0;i<one.length;i++)
			for(int j=0;j<one[0].length;j++)
				if(one[i][j]!=two[i][j])
					judge=false;
		return judge;
	}
	
	/**
	 * This was generated initially by eclipse, but
	 *   eclipse does not know how to compare two-dimensional arrays.
	 *   We therefore call arraysAreEequal to do that job.
	 */
	public boolean equals(Object obj) {
		// If this and obj are the same object, they must be equal
		if (this == obj)
			return true;
		// If obj is null ("this" cannot be null), then they are not equal
		if (obj == null)
			return false;
		// If the two objects are not the same type, they are not equal
		if (getClass() != obj.getClass())
			return false;
		//
		// If we get here, we have two objects of the same type.
		// Calling your helper method to determine the arrays' equality.
		Matrix other = (Matrix) obj;
		return arraysAreEqual(this.values, other.values);
	}
	
	public Matrix plus(Matrix other) {
		int raw=other.values.length;
		int col=other.values[0].length;
		double [][]newArray=new double[raw][col];
		if(other.values.length!=this.values.length||other.values[0].length!=this.values[0].length)
			throw new IllegalArgumentException(); // FIXME
		else	
		{for(int i=0;i<this.values.length;i++)
				for(int j=0;j<this.values[0].length;j++)
					newArray[i][j]+=this.values[i][j]+other.values[i][j];
		}
		Matrix newMatrix=new Matrix(newArray);
		return newMatrix;
	}
	
	/**
	 * Returns a **new Matrix** that is the product of this and the other one.
	 * Does not change this Matrix at all.
	 * @param other
	 * @return
	 */
	public Matrix times(Matrix other) {
		int raw1=this.values.length;
		int raw2=other.values.length;
		int col1=this.values[0].length;
		int col2=other.values[0].length;
		double newArray[][]=new double[raw1][col2];
		if(col1!=raw2)
		throw new IllegalArgumentException(); // FIXME
	
		else{
			for(int i=0;i<raw1;i++)
				for(int j=0;j<col2;j++){
					double sum=0;
					for(int p=0;p<col1;p++)
						sum+=this.values[i][p]*other.values[p][j];
				 newArray[i][j]=sum;
				}
			Matrix newMatrix=new Matrix(newArray);
			return newMatrix;
		}
	}
	
	/**
	 * Returns a **new Matrix** that is the transpose of this one.
	 * Does not change this Matrix at all.
	 * @return
	 */
	public Matrix transpose() {
		int raw=this.values[0].length;
		int col=this.values.length;
		double [][]newArray=new double[raw][col];
		for(int i=0;i<raw;i++)
			for(int j=0;j<col;j++)
				newArray[i][j]=this.values[j][i];
		Matrix newMatrix=new Matrix(newArray);
		return newMatrix; // FIXME
	}

	/**
	 * Modifies this Matrix by scaling row i by the supplied factor.
	 * @param i the row to scale, where 0 is the top row
	 * @param factor the amount by which to scale each element of row i
	 */
	public void scaleRow(int i, double factor) {
		if(i<this.values.length)
		for(int j=0;j<values[0].length;j++)
			values[i][j]*=factor;
		else
			throw new IllegalArgumentException();
	}

	/**
	 * Modifies this matrix by adding row i to row j.  Row 0 is the top row.
	 * @param i
	 * @param j
	 */
	public void addRows(int i, int j) {
		
		for(int k=0;k<values[0].length;k++)
			values[j][k]+=values[i][k];
	}

	/**
	 * My gift to you.  This returns a String representation of
	 * the Matrix.  The contents of each row is separated by a tab (\t)
	 * so that columns (kind of) line up.  Each row is separated by a
	 * newline (\n) so that the output looks like a matrix.  The output
	 * of this method should <i>not</i> be used to compare matrices for
	 * equality:  use the .equals(Object) method instead!
	 */
	public String toString() {
		String ans = "";
		for (int i=0; i < values.length; ++i) {
			ans = ans + "\n";
			// Loop below assumes all rows have the same number of columns
			for (int j=0; j < values[0].length; ++j) {
				ans = ans + values[i][j] + "\t";
			}
		}
		return ans;
	}

}
