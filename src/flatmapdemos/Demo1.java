package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List<Integer>> majorlist=Arrays.asList(list1,list2,list3);
		//it will combine all lists
		majorlist.stream().flatMap(x->x.stream()).forEach(System.out::println);
		
		System.out.println("\nAfter operation: ");
		//to perform some operation on given list //multiply each element by 10
		majorlist.stream().flatMap(x->x.stream()).map(n->n*10).forEach(x->System.out.println(x));
	
		
		//using collect method
		System.out.println("\nUsing collect method: ");
		List<Integer> list = majorlist.stream().flatMap(x->x.stream()).map(y->y*10).collect(Collectors.toList());
		System.out.println(list);
	}

}
