package practise2;

import java.util.Arrays;

public class intSort {
	
	public static void main(String[] args) {
		
		
		int[] arr = {0,1,0,1,2,1,2};
		
		System.out.println("Before sort"+Arrays.toString(arr));
	
		
		//o/p = 0,0,0,1,1,1,2,2
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		
		
		System.out.println("After sort"+Arrays.toString(arr));
		
		
	}

}
