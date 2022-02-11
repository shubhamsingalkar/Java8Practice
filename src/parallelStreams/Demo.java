package parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
	
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}}
// normal stream (sequencial stream) performs operations sequencially (one after another stream)

//parallel stream performs operation simultaneously (parallely) on all streams.


public class Demo {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(new Student("David", 88), new Student("Tom", 78), 
				new Student("Pollard", 65),new Student("Nobita", 95),new Student("Benn", 90));
		
		//Using normal stream() (sequencially)
		List<Student> normalstream = students.stream().filter(n->n.getScore()>80).toList();
		
		for(Student st:normalstream) {
			System.out.println(st.getName()+" "+st.getScore());
		}
		
		//Using parallelstream()
		List<Student> parallelstreams = students.parallelStream().filter(n->n.getScore()>80).toList();
		
		for(Student stu:parallelstreams) {
			System.out.println(stu.getName()+" "+stu.getScore());
		}

		//to convert stream into parallelstream
		List<Student> converted = students.stream().parallel().filter(n->n.getScore()>80).toList();
		for(Student ss:converted) {
			System.out.println(ss.getName()+" "+ss.getScore());
		}
	}

}
