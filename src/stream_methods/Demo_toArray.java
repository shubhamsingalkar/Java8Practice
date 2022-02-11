package stream_methods;

import java.util.Arrays;
import java.util.List;
//toArray() method
public class Demo_toArray {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","b","1","c","2");
		
		Object[] objects = list.toArray(); //converting Collection to array

		for(Object oo:objects) { // iterating elements from array
			
		System.out.println(oo);
		}
	}

}
