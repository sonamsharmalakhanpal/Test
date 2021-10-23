package practise;

import java.util.Scanner;

public class reverseAndSwap {
	
	public static void main(String[] args) {
		
		System.out.println("=============swap=================");
		
		int a=10;
		int b=20;
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("value after swap "+a+","+b);
		
		
		System.out.println("=============reverse int value=================");
		
		int num = 123456;
		int rev=0;
		
		
		while(num!=0) {
			
			rev = rev*10+(num%10);
			num = num/10;
			
			
		}
		
		System.out.println(rev);
		
		System.out.println("=============reverse String value=================");
		
		String str = "sonamlakhanpal";
		String revString = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			revString = revString+str.charAt(i);
		}
		
		System.out.println(revString);
		
		
		System.out.println("=============Plalindrome String=================");
		
		String s = "Madam";
		String rs="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rs= rs+s.charAt(i);
			
		}
		
		if(s.equalsIgnoreCase(rs)) {
			System.out.println("palindrome String");
		}else {
			System.out.println("Not palindrome string");
		}
		
		System.out.println("=============Plalindrome int=================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int org_num=n;
		int rvi=0;
		
		while(n!=0) {
			
			rvi =rvi*10+(n%10);
			n=n/10;
		}
		
//		System.out.println(rvi);
//		System.out.println(n);
		
		if(org_num==rvi) {
			System.out.println(org_num+" Plaindrome int");
		}else {
			System.out.println(org_num+" not a plaindrome int");
		}
	
	
	
	}
	
	
	
	

}
