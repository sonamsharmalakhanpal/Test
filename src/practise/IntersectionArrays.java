package practise;

import java.util.HashSet;

public class IntersectionArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {2,3,4,5};
		int[] arr2 = {4,5,0,-1};
		
		//Intersection common between two arrays
		
		printIntersection(arr1,arr2);
		
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<=arr1.length-1;i++) {
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length-1;i++) {
			
			if(hs.contains(arr2[i])){
				
				System.out.println(arr2[i]);
			}
		}
		
		
	}

}
