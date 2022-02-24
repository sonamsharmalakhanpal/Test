package practise;

public class findcount {
	
	public static void main(String[] args) {
		
		String str = "SonamLakhanpal";
		
		//find count of a
		
		int totallength = str.length();
		
		String str2 = str.replaceAll("a", ""); //remove a so that get length of remainig and then remove from totalLength
		
		int alength = totallength-(str2.length());
		
		System.out.println(alength);
		
		
	}

}
