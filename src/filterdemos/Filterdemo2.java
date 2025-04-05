package filterdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter string whose length is greater than 5 & length is <= 8
public class Filterdemo2 {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Shubham", "John","Vinay","Vrushabh");
		
		List<String> filtered_data = list.stream().filter(str->str.length()<=8 && str.length()>=5).toList();
		System.out.println(filtered_data);
		
		     //OR
		list.stream().filter(str-> str.length()<=8 && str.length()>=5).toList().forEach(System.out::println);
		

	}

}
