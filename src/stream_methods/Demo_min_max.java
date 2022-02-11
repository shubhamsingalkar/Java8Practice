package stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo_min_max {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//count no.of even numbers in list
		long evennum = numList.stream().filter(n->n%2==0).count();
		System.out.println(evennum);
		
		//find maximum number from given list
		Optional<Integer> min = numList.stream().min((num1,num2)->{return num1.compareTo(num2);});
		System.out.println(min.get());
		
		//using without return statement
		Optional<Integer> min2 = numList.stream().min((o1, o2) -> o1.compareTo(o2));
		System.out.println("without return statement: "+min2.get());
		
		//using method reference
		 Optional<Integer> min3 = numList.stream().min(Integer::compareTo);//Integer is class of CompareTo().
	     System.out.println("With method reference: "+min3.get());
	     
	     //similarly for max()
	     Optional<Integer> max = numList.stream().max(Integer::compareTo);
	     System.out.println("Max value: "+max.get());
	}

}
