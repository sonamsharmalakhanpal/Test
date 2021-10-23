package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayTOArrayList {
	
	public static void main(String[] args) {
		
		String[] arr = {"Red","Blue","Green"};
		
		List<String> l = Arrays.asList(arr);
		
		System.out.println(l);
		
		
		//2nd approach create array list and by using for each add in array list arr
		ArrayList<String> ls = new ArrayList<>();
		for(String s:arr) {
			ls.add(s);
		}
		System.out.println(ls);
		
		
		//3rd approch collections.add
		ArrayList<String> ar = new ArrayList<>();
		Collections.addAll(ar, arr);
		System.out.println(ar);
	}

}
