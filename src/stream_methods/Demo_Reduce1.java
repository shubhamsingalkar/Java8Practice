package stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Reducing is the repeated process of combining all elements.
public class Demo_Reduce1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","b","1","c","2","9","e");
        
		Optional<String> reduce = list.stream().reduce((v1, v2)->{return v1+v2;});
		System.out.println(reduce.get());
		
		// to get reverse values
		Optional<String> reduce2 = list.stream().reduce((v1, v2)->v2+v1);
		System.out.println("Reversed reduction printing: "+reduce2.get());
		
		
		List<Integer> numlist = Arrays.asList(14,12,15,16,18);
		Optional<Integer> numreduce = numlist.stream().reduce((num1,num2)->num1+num2);
         System.out.println(numreduce.get());    
	}
	

}
