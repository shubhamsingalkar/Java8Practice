package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;String name,grade;

	public Student(int id, String name, String grade) {

		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
  
		List<Student> list1=new ArrayList<Student>();//1st list
		list1.add(new Student(12, "Andy","A"));
		list1.add(new Student(13, "Sandy","B"));
		list1.add(new Student(14, "Tom","C"));
		
		List<Student> list2=new ArrayList<Student>(); 
		list2.add(new Student(25,"Rohit","B"));
		list2.add(new Student(28,"Virat","B"));
		list2.add(new Student(29,"Sachin","A"));
		
		List<List<Student>> masterlist = Arrays.asList(list1,list2);
         
		 masterlist.stream().flatMap(li->li.stream()).map(l->l.name).forEach(System.out::println);
		
	}

}
