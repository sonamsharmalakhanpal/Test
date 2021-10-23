package practise;

import java.util.HashSet;

public class longestSubstring {
	
	public static void main(String[] args) {
		
		String str = "abcdab";
		System.out.println(findLongestSubstring(str));
		
		
	}

	private static String findLongestSubstring(String str) {
		
		HashSet<Character> hs = new HashSet<>();
		String longestTillNow="";
		String longestTillOverall="";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			Character ch = str.charAt(i);
			if(hs.contains(ch)) {
				longestTillNow="";
				hs.clear();
			}
			hs.add(ch);
			longestTillNow+=ch;
			
			if(longestTillNow.length()>longestTillOverall.length()) {
				longestTillOverall=longestTillNow;
				
			}
			
		}
		
		return longestTillOverall;
		
	}

}
