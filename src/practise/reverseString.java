package practise;

public class reverseString {
	
	public static void main(String[] args) {
		
		rString("Sonam");
		revWords("sonam is tester");
		splitWords("split string words");
		
	}
	
	public static String rString(String revString) {
		
		String s1 = revString;
		String rev="";
		int s1length = s1.length()-1;
		
		for(int i=s1length;i>=0;i--) {
			rev = rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		return revString;
		
	}
	
	public static String revWords(String str) {
		char[] ch = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		return rev;
		
	}
	
	public static String splitWords(String str) {
		String[] s1 = str.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--) {
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
		return rev;
		
	}

}
