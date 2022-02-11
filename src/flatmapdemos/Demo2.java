package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> teamA=Arrays.asList("Joy","Tom","Jerry");
		List<String> teamB=Arrays.asList("Pollard","Brett","Johnson");
		List<String> teamC=Arrays.asList("Kieren","Shahid","Malinga");
		
		List<List<String>> wholeteam = Arrays.asList(teamA,teamB,teamC);
       
		//iterate before java8
		for(List<String> tt:wholeteam) {
			
			for(String ftt:tt) {
				//System.out.println(ftt);
			}
		}
		//after java8
		List<String> collect = wholeteam.stream().flatMap(t->t.stream()).collect(Collectors.toList());
         System.out.println(collect);		
	}

}
