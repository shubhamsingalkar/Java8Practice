package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
// find the salary more than 50k and print the salary in LPA from given collection	
	int id; String name; double salary;
public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	 @Override public String toString() { return "Employee [id=" + id + ", name="
	 + name + ", salary=" + salary + "]"; }
	 
}
public class mapdemo4_Filter_Map {

	public static void main(String[] args) {
		/*
		 * List<Employee> list=new ArrayList<Employee>(); list.add(new Employee(12,"abbas",50000.0)); 
		 * list.add(new Employee(18, "mitali", 45000)); list.add(new Employee(75, "Shivani", 60000)); 
		 * list.add(new Employee(14, "Shubham",85000));
		 */
		//Another way to create arraylist
		
		List<Employee> list = Arrays.asList(new Employee(12, "abbas", 50000),(new Employee(18, "mitali", 45000)),
				(new Employee(75, "Shivani", 60000)),(new Employee(14, "Shubham", 95000))
				);
		
		list.stream().filter(obj->obj.salary>50000).map(sal->(sal.salary*12)/100000+" LPA").forEach(annualsal->System.out.println(annualsal));
		}
	}
