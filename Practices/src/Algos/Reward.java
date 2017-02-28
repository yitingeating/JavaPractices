package Algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reward {
	
	public static List<String> lengthOfReward(String s) {
		List<String> res = new ArrayList<>();
		Set<String> set = new HashSet<>();
		int right = 0;
		int left = 0;
		
		int countA = 0;
		int countL = 0;
		
		while (right < s.length() - 1) {
			char c = s.charAt(right);
			if (c == 'A') countA++;
			else if (c == 'L') countL++;
			
			while (left < right && (countA > 1 || countL > 3)) {
				char toDelete = s.charAt(left++);
				if (toDelete == 'A') countA--;
				if (toDelete == 'L') countL--;
			}
			
			String cand = s.substring(left, right + 1);
			
			if (!set.contains(cand)) {
				res.add(cand);
				set.add(cand);
			}
			
			right++;
		}
		
		return res;
	}

}
