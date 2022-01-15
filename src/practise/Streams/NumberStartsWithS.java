package practise.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithS {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(234,235,678,222,454);
		
		//o/p = 234,235,222
		
		List<Integer> l2 = list.stream().filter(e->String.valueOf(e).startsWith("2")).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
