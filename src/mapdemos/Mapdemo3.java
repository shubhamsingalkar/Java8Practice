package mapdemos;

import java.util.Arrays;
import java.util.List;

public class Mapdemo3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,9,2,11,12,19);

		list.stream().map(num->num*3).forEach(System.out::println);
		
		//if we want sorted data
		System.out.println("Sorted array: ");
		list.stream().map(num->num*3).sorted().forEach(System.out::println);
	}

}
