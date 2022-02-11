package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// convert given array into uppercase
public class Mapdemo1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("kite","joy","katrina","uber");
		List<String> uppercaselist=new ArrayList<String>();
	//without using map()	
		for(String ll:list) {
			uppercaselist.add(ll.toUpperCase());
			}
		System.out.println("Without using map: ");
		System.out.println(uppercaselist);
		
	//using map()
		System.out.println("Using map: ");
		list.stream().map(str->str.toUpperCase()).toList().forEach(up->System.out.println(up));
		/*OR*/
		System.out.println("Using map with method reference: ");
		list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
	}

}
