package stream_methods;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Demo_reduce4 {
	// To get the product of all elements in given range excluding the
      // rightmost element
	public static void main(String[] args) {
	

		int reduce = IntStream.range(3,9).reduce((n1,n2)->n1*n2).orElse(-1); //product of 3*4*....*8
		 System.out.println(reduce);                                          // if not mentioned right order
		                                                                       //then return -1
		
		
	}

}
