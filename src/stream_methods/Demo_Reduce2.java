package stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Display the longest String from collection
public class Demo_Reduce2 {

	
	public static void main(String[] args) {
		
          List<String> list = Arrays.asList("Aurangabad","Mumbai","Pune","Ahmednagar");
	Optional<String> longeststream = list.stream().reduce((w1, w2)->w1.length()>w2.length()?w1:w2);
	System.out.println(longeststream.get());
	}

}
