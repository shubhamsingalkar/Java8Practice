package stream_methods;

import java.util.Arrays;
import java.util.List;

//Non-Terminal/processing methods:
  //distinct()
  //limit()
  //min()
  //max()

//Terminal methods:
  //forEach()
  //count()
  
  

public class Demo1 {

	public static void main(String[] args) {
	
		List<String> vehicles = Arrays.asList("car","bus","car","truck","bicycle","bus");

		
		//distict()
		vehicles.stream().distinct().forEach(value->System.out.println(value));
		
		//count()
		long count = vehicles.stream().distinct().count();
		System.out.println(count);
		
		//limit()
		vehicles.stream().limit(3).forEach(System.out::println);
	}

}
