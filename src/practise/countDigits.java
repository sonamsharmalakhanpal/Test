package practise;

public class countDigits {
	
	public static void main(String[] args) {
		
		//count digits
		
		int num = 123456;
		int count=0;
		
		//o/p-6
		
		
		while(num!=0) {
			
			num= num/10;
			count++;
			
			
		}
		
		System.out.println("Total count of num is:"+count);
		
		
		//sum of digits
		
		int num2 = 23456;
		int sum=0;
		
		while(num2!=0) {
			
			int x = num2%10;
			sum = sum+x;
			num2=num2/10;
		}
		
		System.out.println("sum of digits is:"+sum);
		
		
		//count even and odd digits in no
		
		int num3=12346;
		
		while(num3!=0) {
			
			int x = num3%10;
			if(x%2==0) {
				
				System.out.println(x+"is even no");
			}else {
				System.out.println(x+"is odd no");
			}
			num3=num3/10;
		}
		
	}

}
