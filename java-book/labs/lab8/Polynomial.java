//Shiyao Liu, ID:437742
package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {
	final private LinkedList<Double> list;
	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//
		list = new LinkedList<Double>();
	}
    /**
 * returning a string which can express the polynomial
 */
	public String toString() {
		String s="";
		int length=list.size();
		for(int i=0;i<length;i++)
			s+="+"+list.get(i)+"x^"+i;
		System.out.println(s);
		return s;
	}
	
/**
 * add one term to the original list
 * @param coeff
 * @return
 */
	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;
	}

	/**
	 * evaluate the value of the polynomial given a certain value of the variable
	 * @param x
	 * @return
	 */
	public double evaluate(double x) {
		double sum=0;
		int length=list.size();
		for(int i=0;i<length;i++)
			sum+=list.get(i)*(Math.pow(x, i));
		return sum;
	}
	/**
	 * achieve the derivative of a polynomial
	 * @return
	 */
	public Polynomial derivative() {
		Polynomial deriv=new Polynomial();
		int length=this.list.size();
		for(int i=1;i<length;i++){
			deriv.addTerm(this.list.get(i)*(i));
		}
		return deriv;
	}
	
	public Polynomial sum(Polynomial another) {
		int degree_1=this.list.size();
		int degree_2=another.list.size();
		int differ=Math.abs(degree_1-degree_2);
		int max=Math.max(degree_1,degree_2);
		Polynomial newPoly=new Polynomial();
		if(degree_1!=max)
			for(int i=0;i<differ;i++)
				this.addTerm(0);
		if(degree_2!=max)
			for(int i=0;i<differ;i++)
				another.addTerm(0);
		for(int i=0;i<max;i++)
			newPoly.addTerm(this.list.get(i)+another.list.get(i));
		return newPoly;
			
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}
public static void main(String []args){
	Polynomial p=new Polynomial();
	p.addTerm(3).addTerm(5).addTerm(-3);
	p.toString();
}
}
