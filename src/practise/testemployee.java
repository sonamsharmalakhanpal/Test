package practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class testemployee {
	
	public static void main(String[] args) {
		
		employee e = new employee("rsa",1,"mumbai",30,"it",30000);
		employee e2 = new employee("abc",2,"delhi",25,"admin",20000);
		employee e3 = new employee("ab",3,"delhi",26,"it",40000);
		employee e4 = new employee("acb",4,"delhi",26,"hr",42000);
		
		List<employee> list = new ArrayList<>();
		list.add(e);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		//used filter to get a age above 26
		List<employee> outputlist = list.stream().filter(emp->emp.getAge()<=26).collect(Collectors.toList());
		
		outputlist.forEach(eage->System.out.println(eage));
		
		//used map and stream and Collectors.groupingBy to get by dept each item in list
		
		Map<String, List<employee>> empListBasedOnDept = list.stream().collect(Collectors.groupingBy(employee::getDept));
		
		empListBasedOnDept.entrySet().forEach(entry->System.out.println(entry.getKey()+"-----------"+entry.getValue()));
		
		//to get employee count for each dept
		Map<String,Long> empCount = list.stream().collect(Collectors.groupingBy(employee::getDept,Collectors.counting()));
		
		empCount.entrySet().forEach(entry->System.out.println(entry.getKey()+"-----"+entry.getValue()));
		
		//max and min Salary by using Compartor
		Optional<employee> empMaxSalary = list.stream().max(Comparator.comparing(employee::getSalary));
		System.out.println(empMaxSalary);
		
		//max and min salary by each dept
		Map<String, Optional<employee>> maxSalaryByDept = list.stream().collect(Collectors.groupingBy(employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(employee::getSalary)))));
		
		maxSalaryByDept.entrySet().forEach(entry->System.out.println(entry.getKey()+"----"+entry.getValue()));
		
		/*
		 * employee e1 = new employee("sonam",1,"Karnal",30); employee e2 = new
		 * employee("muneet",2,"kahnauri",32); employee e3 = new
		 * employee("abc",3,"noida",31);
		 * 
		 * List<employee> l = new ArrayList<>(); l.add(e1); l.add(e2); l.add(e3);
		 * 
		 * List<employee> l2 =
		 * l.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
		 * l2.forEach(emp->System.out.println(emp));
		 */
		
		
				
	}
	
	
}
