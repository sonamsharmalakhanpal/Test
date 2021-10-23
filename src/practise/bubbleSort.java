package practise;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		
		//rule1 jene element ne for e.g n then n-1 pass required to sort the array list
		
		//two for loops first for pass and second for compare each two adjustcent elements
		
		
		int[] a = {2,4,1,6,5};
		
		System.out.println("Before sort elements are:"+Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					
				}
			}
		}
		
		System.out.println("After sort elements are:"+Arrays.toString(a));
	}

}
