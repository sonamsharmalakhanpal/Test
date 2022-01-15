package practise;

public class FirstDigit {
	
	public static void main(String[] args) {
		
		
		int a = 134;
		
		int lasDigit = a%10;
		System.out.println(lasDigit);
		
		//inially consider firstDigit equal to the whole number then with while loop remove one by one piche ke digits
		int firstD = a;
		
		while(firstD>=10){
			firstD = firstD/10;
			
		}
		
		System.out.println(firstD);
		
		//sum of firstdigit and lastDigit
		
		System.out.println(firstD+lasDigit);
		
	}
	
	

}
