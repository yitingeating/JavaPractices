package lab8;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;
import org.junit.Test;

import junit.framework.TestCase;

public class PolynomialTest extends TestCase {
	private Polynomial p0 = new Polynomial();
	private Polynomial p1 = synthPoly(new double[] {  4, -7,  0, 11});
	private Polynomial p2 = synthPoly(new double[] {  7,  5, -2,  5});
	private Polynomial p3 = synthPoly(new double[] { -1,  2,  3, -4, 5});
	private Random random = new Random();

	/**
	 * Helper method to generate a Polynomial from an array of doubles.
	 * @param coeffs
	 * @return
	 */
	private Polynomial synthPoly(double[] coeffs) {
		Polynomial ans = new Polynomial();
		for (double d : coeffs) {
			ans.addTerm(d);
		}
		return ans;
	}

	@Test
	public void testSum() {
		Polynomial sum     = synthPoly(new double[] { 3, -5, 3, 7, 5});
		assertEquals(sum,     p1.sum(p3));
		assertEquals(sum,     p3.sum(p1));
		assertEquals(p0,      p0.sum(p0));
	}

	@Test
	public void testDeriv() {
		Polynomial p1Deriv = synthPoly(new double[] { -7,  0, 33});
		Polynomial p2Deriv = synthPoly(new double[] {  5, -4, 15 });

		assertEquals(p1Deriv, p1.derivative());
		assertEquals(p2Deriv, p2.derivative());
		assertEquals(p0, p0.derivative());
	}

	@Test
	public void testEval() {
		assertEquals(49.0, p2.evaluate(2.0), .01);
		assertEquals(0.0,  p0.evaluate(100), .01);
	}

	/**
	 * Geneates an array of random coefficients
	 * @param num The size of the array
	 * @return an array of random numbers, each in the range 0...99
	 */
	private double[] genRandomCoeffs(int num) {
		double[] ans = new double[num];
		for (int i=0; i < num; ++i) {
			ans[i] = random.nextInt(100);
		}
		return ans;
	}

	@Test
	public void testLikeTheresNoTomorrow() {
		for (int i=0; i < 100; ++i) {
			// Cook up two polynomials of random degree (but at least 1) and with
			//   random coefficients
			double [] coeffs1 = genRandomCoeffs(random.nextInt(7)+1);
			double [] coeffs2 = genRandomCoeffs(random.nextInt(7)+1);
			Polynomial p1 = synthPoly(coeffs1);
			Polynomial p2 = synthPoly(coeffs2);
			
			// Compute the sum and the derivative of the sum here
			Polynomial sum = new Polynomial();
			Polynomial der = new Polynomial();
			for (int j=0; j < Math.max(coeffs1.length, coeffs2.length); ++j) {
				// Sum of this term
				double sTerm = 0;
				if (j < coeffs1.length) sTerm = sTerm + coeffs1[j];
				if (j < coeffs2.length) sTerm = sTerm + coeffs2[j];
				
				sum.addTerm(sTerm);
				
				// Derivative of the sum of this term
				if (j > 0) der.addTerm(sTerm*j);
			}
			
			// Compare what we computed here with what Polynomial computes
			assertEquals(sum, p1.sum(p2));
			assertEquals(der, p1.sum(p2).derivative());
		}
	}

	@Test
	public void testPrint() {
		System.out.println("p2 is " +p2);
		System.out.println("p2's derivative is " + p2.derivative());
		System.out.println("new poly is " + new Polynomial());
	}

}
