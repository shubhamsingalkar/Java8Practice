package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//find even number from given array
public class Filterdemo1 {

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> numberslist=new ArrayList<Integer>(); 
		 * numberslist.add(15);numberslist.add(20);  numberslist.add(25); 
		   numberslist.add(30);*/


		/* OR  (Another way to make arraylist)*/
		List<Integer> numberlist= Arrays.asList(15,20,25,30,5,6,8);
		List<Integer> evennumberlist=new ArrayList<Integer>();
		//filtering without filter()
		for(int ii:numberlist) {
			if(ii%2==0) {evennumberlist.add(ii);}}
		System.out.println(evennumberlist);


		//with using filter
		evennumberlist = numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		// OR evennumberlist = numberlist.stream().filter(n->n%2==0).toList();
		System.out.println(evennumberlist);

		//using forEach method
		numberlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		//Using method reference
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);
	}
}
