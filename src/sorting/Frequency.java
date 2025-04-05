package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> ll = Arrays.asList(55, 56, 55, 67, 56, 55, 67, 88);

		ll.stream().collect(Collectors.groupingBy(n->n%2, Collectors.counting())).forEach((p,q)-> {
		
		if(p == 0)
		System.out.println("Count of even numbers:"+q);});
		
		
		
		
	}

}
