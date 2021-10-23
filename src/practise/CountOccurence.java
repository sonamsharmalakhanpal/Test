package practise;

public class CountOccurence {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String str = "java";
		
		
		//o/p a-2
		
		int Totallength = str.length();
		int lengthwithouta = str.replaceAll("a", "").length();
		
		int alength = Totallength-lengthwithouta;
		
		System.out.println("count of a is: "+alength);
	}

}
