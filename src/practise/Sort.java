package practise;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,1};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		int[] a = {10,100,1,3};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
