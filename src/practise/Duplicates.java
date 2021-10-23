package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {
	
	public static void main(String[] args) {
	
	
	String[] companieslist = {"HCL","Amazon","HCL","RBS"};
	
	
	// 1st method is brute force-like take two for loops and second loop with one plus index and comapare each element with next element
	// java collections-by using Hash Set
	// java collection-by using Hash map
	//jdk 8-stream and filter
	
	
	System.out.println("*********Hash Set************");
	
	HashSet<String> data = new HashSet<String>();
	for(String s:companieslist) {
		if(data.add(s)==false) { //set store only distinct values so if we try to add any duplicate value of list into hash set if condition get false and then that will give/print that value
			System.out.println(s);
		}
	}
	
	
	System.out.println("*********Hash Map************");
	
	HashMap<String, Integer> hm = new HashMap<String,Integer>();
	for(String s:companieslist) {
		Integer count = hm.get(s); //first time count is null but if element already thr then count will become one and we will get dupliactethen
		if(count==null) {
			hm.put(s, 1);
		}else {
			hm.put(s, ++count);
		}
		
	}
	
	//now print that duplicate value
	Set<Entry<String, Integer>> st = hm.entrySet();
	for(Entry<String, Integer> entry:st) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
	
	
	System.out.println("*********jdk 8************");
	
	//take arr put in list bcs stream will work on list 
	//then declare hashset and add values in it, if value not get added as hashset dont allow duplaicates then
	//collect that by using collect().Collectors.toSet() and put in new hasSet  or store in same old hashset and print it
	
	String[] arr = {"Java","Amazon","GCP","Azure","Java"};
	
	Set<String> hs = new HashSet<String>();
	
	Set<String> nhs = Arrays.asList(arr).stream().filter(ele -> !hs.add(ele)).collect(Collectors.toSet());
	
	System.out.println(nhs);
	
	
	
	
	System.out.println("*********jdk 8 find char duplicate************");
	
	String a = "Googlllle"; //count l
	
	int count = (int)a.chars().filter(ele->ele=='l').count();
	
	System.out.println("l present in==>"+a +":" +count);
	
	}
	
	

}
