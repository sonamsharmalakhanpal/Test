package practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class test {
	
	public static void main(String[] args) {
		
		System.out.println("Work hard you will get success");
		
		System.out.println(removeStringJunk("%^^%^&^Sonam%$%^%^*&^*Lakhanpal"));
		System.out.println(removeStringCharacters("%^^%^&^Sonam%$%^%^*&^*Lakhanpal"));//opp of above (remove ^)
		
		String str = "Sonam Lakhanpal";
		String str2 = "Sonam Lakhanpal";
		String str3 = " Sonam Lakhanpal ";
		int i = 20;
		int x = 30;
		
		String date = "01-01-2021";
		System.out.println(str.replace('a', 'u'));
		
		System.out.println(str.indexOf('a'));//1st occurence of a
		System.out.println(str.indexOf('a',str.indexOf('a')+1));//2nd occurance of a
		System.out.println(str.indexOf('a',str.indexOf('a',str.indexOf('a')+1)+1));
		
		System.out.println(str.substring(0,str.indexOf('L')-1)); //or
		System.out.println(str.substring(0,str.indexOf(" ")));
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.equals(str2));
		System.out.println(str.contains(str3));
		
		System.out.println(str==str2);//true
		
		System.out.println(str+str2+i+x);
		System.out.println(i+x+str+str2);
		
		System.out.println(str.concat(str3));
		
		System.out.println(str3.trim());
		System.out.println(str3.replace(" ", ""));
		
		System.out.println(date.replaceAll("-", "/"));
		System.out.println(date.replace("-", "/"));
		
		String st4 = "Sonam 123";
		String[] s = st4.split(" ");
		System.out.println("Remove 123 : "+s[1]);
		
		String a = "Googlllle"; //count l
		int count = (int)a.chars().filter(ele->ele=='l').count();
		
		System.out.println("l count is:"+count);
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(Entry<Character,Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
			
		}
		
		
		
		
	}
	
	public static String removeStringJunk(String str) {
		
		String st = str.replaceAll("[^a-zA-Z0-9]", "");
		
		return st;
		
	}
	
	
	public static String removeStringCharacters(String str) {
		
		String st = str.replaceAll("[a-zA-Z0-9]", "");
		
		return st;
		
	}
	}


