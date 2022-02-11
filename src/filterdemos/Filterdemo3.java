package filterdemos;
//print the element by removing null 
import java.util.Arrays;
import java.util.List;

public class Filterdemo3 {

	public static void main(String[] args) {
		
		List<String> citylist = Arrays.asList("pune","nagpur",null,"delhi",null);
		
        List<String> list = citylist.stream().filter(str->str!=null).toList();
        System.out.println(list);
        
        //OR
        citylist.stream().filter(str->str!=null) //filtering
        .forEach(System.out::println); //iterating
	}

}
