package stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Skipping {

	public static void main(String[] args) {
	
	List<String> list = Arrays.asList("A","B","C","D","E");

	//skipping first 3 elements
	
	  List<String> list2 = list.stream().skip(3).toList();
	
	for(String ss:list2) {
	System.out.println(ss);
	}

}
}
