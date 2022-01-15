package practise.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOddNumbers {
	
	public static void main(String[] args) {
		
		
		/*
		 * List<Integer> list = Arrays.asList(2,3,4,5,6);
		 * 
		 * List<Integer> evenNumbers =
		 * list.stream().filter(e->e%2==0).collect(Collectors.toList());
		 * 
		 * System.out.println(evenNumbers);
		 * 
		 * List<Integer> oddNumbers =
		 * list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		 * System.out.println(oddNumbers);
		 */
		
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		List<Integer> even_Numbers = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(even_Numbers);
		
		List<Integer> odd_Numbers = list.stream().filter(e->!(e%2==0)).collect(Collectors.toList());
		System.out.println(odd_Numbers);
	}

}
