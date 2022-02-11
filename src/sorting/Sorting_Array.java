package sorting;

import java.util.Arrays;
import java.util.List;

public class Sorting_Array{

	public static void main(String[] args) {
	
		Integer a[]= {12,14,7};
		
		 List<Integer> asList = Arrays.asList(a);
	asList.stream().sorted().toList().forEach(System.out::println);
         
	}

}
