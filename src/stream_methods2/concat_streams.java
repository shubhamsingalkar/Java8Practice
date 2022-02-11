package stream_methods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class concat_streams {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Java", "is","easy");
		List<String> list2 = Arrays.asList("if","you","prepared","well");
	
		//convert each list into stream
		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();
		
	Stream.concat(stream1, stream2).toList().forEach(System.out::println);
	
	}

}
