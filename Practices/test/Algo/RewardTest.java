package Algo;

import java.util.List;

import org.junit.Test;

import Algos.Reward;

public class RewardTest {

	@Test
	public void test() {
		String s = "AAAOOOLLOLOLOAALOLLOOOLA";
		
		List<String> res = Reward.lengthOfReward(s);
		
		
		for (String a : res) {
			System.out.println(a);
		}
	}
	
	@Test
	public void test2() {
		String s = "321abcdEfgHijkkLiINPCNWlmnopqrst41uvwxyz";
		
		System.out.println(LongestSubstringOfAtoZ.solve(s));
	}
}
