package practise2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatePractise2 {
	
	public static void main(String[] args) {
		
		
		String arr[] = {"hcl","rbs","hcl"};
		
		HashSet<String> hs = new HashSet<>();
//		
//		for(int i=0;i<=arr.length-1;i++) {
//			if(hs.add(arr[i])==false) {
//				System.out.println("Duplicate elements are "+ arr[i]);
//			}
//		}
		
		//jdk8
		
//		Set<String> s = Arrays.asList(arr).stream().filter(ele->(hs.add(ele)==false)).collect(Collectors.toSet());
//		System.out.println(s);
		
		
		//count occurence or find duplicate with HashMap
		
		HashMap<String,Integer> hm = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			Integer count = hm.get(arr[i]);
			if(count==null) {
				hm.put(arr[i], 1);
			}else {
				hm.put(arr[i], ++count);
			}
		}
		
//		Set<Entry<String, Integer>> e = hm.entrySet();
//		for(Entry<String,Integer> e2: e){
//			System.out.println(e2.getKey());
//			System.out.println(e2.getValue());
//			
//			
//		}
		
//		Set<Entry<String, Integer>> e = hm.entrySet();
//		for(Entry<String, Integer> e2: e) {
//			
//			if(e2.getValue()>1) {
//				System.out.println(e2.getKey());
//				
//			}
//		}
		
		Set<String> s = Arrays.asList(arr).stream().filter(ele->(hs.add(ele))==false).collect(Collectors.toSet());
		System.out.println(s);
		
		
		
	}

}
