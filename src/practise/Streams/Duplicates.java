package practise.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Duplicates {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(2,3,2,4,5,3);
		
//		Set<Integer> s1 = l1.stream().filter(e->Collections.frequency(l1, e)>1).collect(Collectors.toSet());
		
		Set<Integer> s1 =new HashSet<Integer>();
		Set<Integer> dup = l1.stream().filter(e->!s1.add(e)).collect(Collectors.toSet());
		System.out.println(dup);
		
		
	}

}
