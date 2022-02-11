package stream_methods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//findFirst();
//findAny();
public class Finding {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ascii","Binary","Ternary","Fibonacci");
		
		Optional<String> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());
		//if the list is empty then we get "NoSuchElement Exception".
		
		Optional<String> findAny = list.stream().findAny();
		//finds random element from list, if list is empty then we get "NoSuchElementException".
		System.out.println(findAny.get());
		
	}

}
