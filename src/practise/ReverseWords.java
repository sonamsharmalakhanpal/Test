package practise;

import java.util.Stack;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		
		String str = "Hello World";
		String rev="";
		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev+str.charAt(i);
//		}
		
//		System.out.println(rev);
		
		
		//============reverse each word not whole line===============
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}else {
				while(st.empty()==false) {
				System.out.println(st.pop());
				}
			}
			
			while(st.empty()==false) {
				System.out.println(st.pop());
			}
			
		}
		
		
		
		
	}

}
