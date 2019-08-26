import java.util.LinkedList;

public class MaxTripleLength {
	
	public int maxTripleLength(LinkedList<String> strg) {
		int maxLength = 0;
		for(int i =1; i< strg.size(); i++) {
			
			String triple = strg.get(i-1) + strg.get(i) + strg.get(i+1);
			
			if(maxLength < triple.length()) {
				maxLength = triple.length();
			}
			
		}
		return maxLength;

		
	}
	
	
}
