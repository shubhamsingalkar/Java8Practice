package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FrequencyOfElementsAndDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(85,12,153,426,88,85,12,153);

		
		System.out.println("====Frequency of element====");
		list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((p,q)->System.out.println(p+" appears "+q+" times"));
	                
		
		System.out.println("===frequency appears more than 1 times OR Duplicate elements===");
		list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((p,q)->{if(q>1) System.out.println(p+" appears "+q+" times");});
		                               //OR//
		//list.stream().filter(n->Collections.frequency(list, n)>1).collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((p,q)->System.out.println(p+" appears "+q+" times"));
		
		
        System.out.println("========Duplicate elements========");
		Set<Integer> set = list.stream().filter(n-> Collections.frequency(list, n)>1).collect(Collectors.toSet());
		System.out.println(set);
		
		System.out.println("New one");
		list.stream().collect(Collectors.groupingBy(t->t, Collectors.counting())).forEach((p,q)->System.out.println(p +"--"+ q));
	}

}
