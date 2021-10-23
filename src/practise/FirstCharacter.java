package practise;

public class FirstCharacter {
	
	public static void main(String[] args) {
		
		String str = "Sonam Lakhanpal";
		//o/p =SL
		
		firstCharacter(str);
	}

	private static void firstCharacter(String str) {
		String[] s = str.split(" ");//split on the basis of space
		for(int i=0;i<=s.length-1;i++) { //use for loop to one by one sonam and lakhanpal
			String s2 = s[i]; //save sonam and lakhanpal[i] each time in s2
			System.out.println(s2.charAt(0)); //then print s2 first i.e s2[0]

		}
		
	}

}
