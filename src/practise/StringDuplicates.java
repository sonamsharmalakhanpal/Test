package practise;

import java.util.Arrays;
import java.util.HashSet;

public class StringDuplicates {
	
	
	public static void main(String[] args) {
		
		String st  = "abccbef";
		
		String[] starr = st.split("");
		
		
		
//		long ls = st.chars().filter(e->e=='b').count();
//		System.out.println(ls);
		
		for(int i=0;i<=starr.length-1;i++)
		{
			for(int j=i+1;j<=starr.length-1;j++) {
				
				if(starr[i]==starr[j]) {
					System.out.println("Duplicate:"+starr[i]);
					
				}
			}
			
			System.out.print(starr[i]);
		
		}
	
		
	}

}
