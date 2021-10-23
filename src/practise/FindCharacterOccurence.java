package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindCharacterOccurence {
	
	public static void main(String[]args) {
		
		String str = "SonamLakhanpal";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			Integer count = hm.get(str.charAt(i));
			
			if(hm.get(str.charAt(i))==null){
				hm.put(str.charAt(i), 1);
			}else {
				hm.put(str.charAt(i), ++count);
			}
			
			
		}
		
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue()+" ");
			
			
		}
		
		System.out.println("==============String array practise================");
		
		
		String str2[] = {"sonam","lakhanpal","sonam"};
		
		HashMap<String, Integer> hm2 = new HashMap<>();
		
		for(String s:str2) {
			
			Integer count2 = hm2.get(s);
			
			if(hm2.get(s)==null) {
				hm2.put(s, 1);
			}else {
				hm2.put(s, ++count2);
			}
			
		}
		
		for(Map.Entry entry:hm2.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
		System.out.println("==============find particular character in String================");
		
		String str3 = "SonamLakhanpal";
		
		//find a count
		
		int count = (int)str3.chars().filter(e-> (char)e=='a').count();
		System.out.println(count);
		
	}

}
