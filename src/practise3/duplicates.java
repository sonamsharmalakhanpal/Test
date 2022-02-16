package practise3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicates {
	
	public static void main(String[] args) {
		
		
		Integer[] arr = {2,3,4,5,6,7,2};
		String[] starr = {"hcl","rbs","hcl"};
		String str = "Sonamo";
		
		HashSet<Integer> hs = new HashSet<Integer>();
		List<Integer> l = Arrays.asList(arr);
		
		Set<Integer> s = l.stream().filter(e->!hs.add(e)).collect(Collectors.toSet());
		System.out.println(s);
		
		//2nd way by using HashSet
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr) {
			if(set.add(i)==false) {
				System.out.println(i);
			}
		}
		
		HashSet<String> hss = new HashSet<String>();
		for(String s2:starr) {
			if(hss.add(s2)==false) {
				System.out.println(s2);
			}
		}
		
		
		HashSet<String> hs3 = new HashSet<String>();
		List<String> l2 = Arrays.asList(starr);
		System.out.println(l2.stream().filter(e->!hs3.add(e)).collect(Collectors.toSet()));
		
	}

}
