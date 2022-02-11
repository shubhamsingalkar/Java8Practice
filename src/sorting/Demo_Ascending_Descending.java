package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo_Ascending_Descending {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(7,6,8,3,2,12,5);

		list1.stream().sorted().toList().forEach(System.out::println); //Ascending order


		System.out.println("Descending order: ");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //descending order

		//same we can do it for String Array/Collection
	}
}
