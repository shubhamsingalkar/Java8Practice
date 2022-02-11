package mapdemos;

import java.util.Arrays;
import java.util.List;
//find the length of each element in the array/collection
public class Mapdemo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("car","Aeroplane","Bike","Scooter","Bicycle");
		list.stream().map(str->str.length()).forEach(System.out::println);
	}
}
