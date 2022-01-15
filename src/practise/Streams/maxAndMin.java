package practise.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxAndMin {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
//      Integer maxnum = list1.stream().reduce(1, (a, b) -> a > b ? a : b);
//		Integer maxnum = list1.stream().max((e1,e2) -> e1-e2).get();
		Integer maxnum  = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		Integer minnum = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
      System.out.println(maxnum);
      System.out.println(minnum);
	}

}
