package practise;

public class insertSpecificInt {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6};
		int value=3;
		int loc = 2;
		int lastelement= arr[arr.length-1];
		
		for(int i=arr.length-1;i>loc;i--) {
			
			arr[i]=arr[i-1];//5th position pe 4 th postion pe shift karo so that add new element
		}
		arr[loc]=value;
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println(lastelement);
	}

}
