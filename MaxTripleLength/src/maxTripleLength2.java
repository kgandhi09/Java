import java.util.LinkedList;

public class maxTripleLength2 {

	public int maxTripleLength2(LinkedList<String> strg) {

		for (int i = 1; i < strg.size(); i++) {

			LinkedList<String> triples = new LinkedList<String>();
			
			String triple = strg.get(i - 1) + strg.get(i) + strg.get(i + 1);
			triples.add(triple);
		}
	}

}
