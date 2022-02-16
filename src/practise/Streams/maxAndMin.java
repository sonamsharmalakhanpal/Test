package practise.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class maxAndMin {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
//      Integer maxnum = list1.stream().reduce(1, (a, b) -> a > b ? a : b);
//		Integer maxnum = list1.stream().max((e1,e2) -> e1-e2).get();
		Integer maxnum  = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		Integer minnum = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
      System.out.println(maxnum);
      System.out.println(minnum);
      
      List<Integer> l = Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
      Integer max = l.stream().max(Comparator.comparing(Integer::valueOf)).get();
      
      Integer min = l.stream().min(Comparator.comparing(Integer::valueOf)).get();
      
      System.out.println(max+" and "+min);
      
     //find average
     double p = l.stream().mapToInt(e->e).average().getAsDouble();
     System.out.println(p);
     
     //even and odd
     List<Integer> evenNo = l.stream().filter(e->(e%2==0)).collect(Collectors.toList());
     System.out.println(evenNo);
     
    List<Integer> oddNo =  l.stream().filter(e->(e%2!=0)).collect(Collectors.toList());
    System.out.println(oddNo);
    
    //find duplicates
    HashSet<Integer> hs = new HashSet<>();
    List<Integer> dup = l.stream().filter(e->!hs.add(e)).collect(Collectors.toList());
    System.out.println(dup);
      
    //numbers start with s
    List<Integer> list = Arrays.asList(234,235,678,222,454);
    List<Integer> tlist = list.stream().filter(e->String.valueOf(e).startsWith("2")).collect(Collectors.toList());
    System.out.println(tlist);
	}

}
