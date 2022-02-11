package mapdemos;

import java.util.Arrays;
import java.util.List;

public class Student {

	int rollno;
	String name;
	Phone ph;

	public Student(int rollno, String name, Phone ph) {
		this.rollno = rollno;
		this.name = name;
		this.ph = ph;
	}
	

public static void main(String[] args) {
	
	List<Student> student=Arrays.asList(new Student(10,"ABC",new Phone(986598, 60000))
			,new Student(11,"BCD", new Phone(56326, 90000)), new Student(66, "STU",new Phone(65986, 40000)));
	
	student.stream().filter(s->s.ph.cost>50000).forEach(System.out::println);
	
	
	
	}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", ph=" + ph + "]";
}

}
