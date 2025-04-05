package sorting;

import java.util.HashMap;
import java.util.Map;

public class AlphabetFrequencyInString {

	public static HashMap<Character, Integer> countEachAlphabet(String input){

	    HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();


		input.chars().mapToObj(c-> (char) c)
		//.filter(Character:: isLetter) // to skip the space
		//.map(Character::toLowerCase)
		.forEach(ch -> 
			
			//frequencyMap.put(ch, frequencyMap.get(ch)==null?1:frequencyMap.get(ch)+1));
		                    //OR
		    frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1));
		
		
		return frequencyMap;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> result = countEachAlphabet("MY NAME IS SHUBHAM");
		
          result.forEach((key,value)-> System.out.println(key+ ":" +value));		


	}

}
