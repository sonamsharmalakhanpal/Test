package practise;

import java.util.HashSet;

public class LongestNonRepeating2 {
	
	public static void main(String[] args) {
		
		String str = "abcdab";
		String longestTillNow = "";
		String longestOverall="";
		
		HashSet<Character> hs = new HashSet<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			Character ch = str.charAt(i);
			if(hs.contains(ch)) {
				//hs.clear();
				longestTillNow="";
		
			}else {
				hs.add(ch);
				longestTillNow=longestTillNow+ch;
			}
			
			if(longestTillNow.length()>longestOverall.length()) {
			longestOverall=longestTillNow;
			
		    }
		
		
		}
		
		System.out.println(longestOverall);

		
	}
	
	

}
