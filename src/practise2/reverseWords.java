package practise2;

public class reverseWords {
	
	public static void main(String[] args) {
		
		String str = "Sonam Lakhanpal";
		
		String[] st = str.split(" ");
		
		for(int i=st.length-1;i>=0;i--) {
			
			System.out.print(st[i]+" ");
		}
		
	}

}
