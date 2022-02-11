package stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//output==>Greek-for-Greeks
public class Demo_Reduce3 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Greek","for","Greeks");
       
		  Optional<String> reduce = list.stream().reduce((l1,l2)->l1+"-"+l2);
	        System.out.println(reduce.get());
	}

}
