package practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap2 {
	
	public static void main(String[] args) {
		
		
		String str = "Banana";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			Integer count = hm.get(c);
			if(count==null) {
				hm.put(c, 1);
			}else {
				hm.put(c, ++count);
			}
		}
		
		Set<Entry<Character, Integer>> set = hm.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Character, Integer> entry:list) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		}

}
	
