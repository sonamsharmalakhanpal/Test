package practise;

public class findSegment {

	public static void main(String[] args) {
		
		int arr[] = {3,5,4,3,4,5,5,3,6};
		int count=0;
		
		for(int i=0;i<=arr.length-1;i+=2){
			
			if(arr[i] ==4) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);

	}

}
