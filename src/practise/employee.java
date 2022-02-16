package practise;

public class employee {
	
	
	
	String name;
	int id;
	String city;
	int age;
	String dept;
	int salary;
	
 public  employee(String name,int id,String city,int age,String dept,int salary) {
	 this.name=name;
	 this.id=id;
	 this.city=city;
	 this.age=age;
	 this.dept=dept;
	 this.salary=salary;
 }
 
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
 
	public String toString() 
	{ 
	return this.id+"\t"+this.name+"\t\t"+this.age+"\t\t\t"+this.city+"\t"+this.dept+"\t"+this.salary;
	}
}
