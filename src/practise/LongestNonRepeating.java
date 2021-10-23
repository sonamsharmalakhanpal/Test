package practise;

import java.util.HashMap;
import java.util.HashSet;

public class LongestNonRepeating {

	public static void main(String[] args) {
		
		String str = "abcdab";
		String longestTillNow = "";
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			Character ch = str.charAt(i);
			
			if(hs.contains(ch)) {
				
				longestTillNow = "";
				//hs.clear();
			}else {
				hs.add(ch);
				longestTillNow = longestTillNow+ch;
				
			}
			
			System.out.println(longestTillNow);
			
		}
		
		

	}

}
