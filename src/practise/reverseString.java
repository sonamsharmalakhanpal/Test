package practise;

public class reverseString {
	
	public static void main(String[] args) {
		
		String s1 = "Sonam is very hard working girl";
		char rev = 0;
		
		
		for(int i=s1.length()-1;i>=0;i--) {
			 rev = s1.charAt(i);
			 System.out.print(rev);
			
		}
		
		
		
	}

}
