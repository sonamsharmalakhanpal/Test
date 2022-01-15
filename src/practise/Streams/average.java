package practise.Streams;

import java.util.Arrays;
import java.util.List;

public class average {
	
	public static void main(String[] args) {
		
		
		/*
		 * List<Integer> list = Arrays.asList(3,4,5,6,10); Double d =
		 * list.stream().map(e->e*e).filter(e->e>6).mapToInt(e->e).average().getAsDouble
		 * (); System.out.println(d);
		 * 
		 * 
		 */
		
		List<Integer> list = Arrays.asList(2,3,4,4,5,5);
		Double d = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(d);
	}

}
