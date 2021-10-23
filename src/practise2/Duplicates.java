package practise2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Duplicates {
	
	public static void main(String[] args) {
		
		String sa[] = {"hcl","rbs","hcl"};
		
		//1st approach by using hashSet--dont allow duplicate so when any duplicate  value will not add to hashSet then we can catch that 
		
		Set<String> hs = new HashSet<String>();
		
		for(int i=0;i<=sa.length-1;i++) {
		if(hs.add(sa[i])==false) {
			System.out.println(sa[i]);
		}
			
		}
		
		//2nd approach with hashMap count each occurence with key value and then where key>1 catch it
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<=sa.length-1;i++) {
			Integer count = hm.get(sa[i]);
			if(count==null) {
				hm.put(sa[i],1);
			}else {
				hm.put(sa[i], ++count);
			}
			
			
		}
		
		
		Set<Entry<String,Integer>> e = hm.entrySet();
		for(Entry<String,Integer> en: e) {
			System.out.print(en.getKey());
			System.out.print(en.getValue());
		}
		
		//3rd approach java 8
		
		HashSet<String> hm2 = new HashSet<String>();
		Set<String> s = Arrays.asList(sa).stream().filter(ele->(hm2.add(ele)==false)).collect(Collectors.toSet());
		System.out.println(s);
		
				
	}

}
