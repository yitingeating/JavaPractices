package ObjectOrientedProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckBalanceUnitTest {
	
	@Test
	public void test() {
		String[] tests = new String[]{"{werxcxc}", "(xcvl][", "(lsnd)"};
		
		CheckBalance2 checker = new CheckBalance2(tests[0]);
		assertTrue(checker.balanced());
		
		checker = new CheckBalance2(tests[1]);
		assertFalse(checker.balanced());
		
		checker = new CheckBalance2(tests[2]);
		assertTrue(checker.balanced());
	}
	
	@Test
	public void test2() {
		String[] tests = new String[]{"{w[erxcx]c}", "(xc{vl][", "(lsnd)"};
		
		CheckBalance2 checker = new CheckBalance2(tests[0]);
		assertTrue(checker.balanced());
		
		checker = new CheckBalance2(tests[1]);
		assertTrue(checker.balanced());
		
		checker = new CheckBalance2(tests[2]);
		assertTrue(checker.balanced());
	}
}
