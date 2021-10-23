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

public class occurenceInDesc {
	
	public static void main(String[] args) {
		
		String str = "Banana";
		//o/p =a-3 n-2 B-1 in desc order
		
		OccrenceDesc(str);
		
		}

	private static void OccrenceDesc(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			Integer value = hm.get(str.charAt(i));
			
			if(value!=null) {
				hm.put(str.charAt(i),++value);
			}else {
				hm.put(str.charAt(i),1);
			}
		}
		
		Set<Entry<Character,Integer>> set= hm.entrySet(); 
		List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
			Collections.sort(list,new Comparator<Entry<Character, Integer>>() {

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			
			for(Entry<Character, Integer> entry: list) {
			System.out.println("The frequency of character is: "+entry.getKey()+" and value is: "+entry.getValue());
			}
		}	
			
	
	}
	
	
	
	
	
	
	


