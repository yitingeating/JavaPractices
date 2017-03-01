package Algo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringOfAtoZ {

	public static String solve(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		int right = 0;
		int left = 0;
		
		int n = s.length();
		
		while (right < n) {
			char c = Character.toLowerCase(s.charAt(right));
			
			if (c >= 'a' && c <= 'z') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			
			if (map.size() == 26) {
				while (map.getOrDefault(Character.toLowerCase(s.charAt(left)), 0)!= 1) {
					char leftChar = Character.toLowerCase(s.charAt(left));
					if (map.containsKey(leftChar)){
						map.put(leftChar, map.get(leftChar) - 1);
					}
					left++;
				}
				
				return s.substring(left, right + 1);
			}
			right++;
		}
		
		return null;
	}
}
