package practise;

public class evenPositionElements {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,8};
		
		int count =0;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);//even nos from arr(list)if any single big no given then num%10 and num /10 rule and if condition		
			}
		}
		
		System.out.println("=========check no is even or not=============");
		
		int num = 1234;
		
		while(num>0){
			
			int n = num%10;
			
			if(num%2==0) {
				System.out.println("no is even");
			}else {
				
				break;
			}
			num=num/10;
		}
		
		
		System.out.println("========count even no=============");
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]%2==0) {
				count= count+1;
			}
		}
		
		System.out.println("even no is arr are"+count);
		
		
		System.out.println("=========print even position nos=============");
		
		
		for(int i=2;i<=arr.length-1;i=i+2) {
			
			System.out.println(arr[i]);//even position not even
			
		}
	}

}
