package stream_methods2;

import java.util.HashSet;
import java.util.Set;
//anyMatch()
//allMatch()
//noneMatch
public class Matches {

	public static void main(String[] args) {
		
		Set <String> ss=new HashSet<String>();//we took Set because we need unique element
		
		ss.add("One apple");ss.add("One Orange");ss.add("Two apple");ss.add("One Banana");
		ss.add("Two Banana");

		boolean anyMatch = ss.stream().anyMatch(v->{return v.startsWith("One");});
		//at least one element should match with "One" otherwise false
		System.out.println(anyMatch);
		
		boolean allMatch = ss.stream().allMatch(v->{return v.startsWith("One");});
		// all element should start with "One" otherwise returns false
		System.out.println(allMatch);
		
		boolean noneMatch = ss.stream().noneMatch(v->{return v.startsWith("Five");});
	     // none start with "Five" otherwise returns false
		System.out.println(noneMatch);
		
		//similary we can do it with "endwith()" method
	}

}
