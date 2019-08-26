import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples {
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Double> showResults = new LinkedList<Double>();
	DataSmooth1 D1 = new DataSmooth1();
	DataSmooth2 D2 = new DataSmooth2();

	LinkedList<Episode> eps1 = new LinkedList<Episode>();
	LinkedList<Episode> eps2 = new LinkedList<Episode>();
	LinkedList<Episode> eps3 = new LinkedList<Episode>();
	LinkedList<Episode> eps4 = new LinkedList<Episode>();

	public DataSmoothExamples() {

		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));
		shows.add(new Show("Star Trek", 1800, eps1, false));

		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2, false));

		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3, false));

		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4, false));

		showResults.add(60.0);
		showResults.add(29.75);
		showResults.add(29.083333333333332);
		showResults.add(58.0);
	}

	@Test
	public void instructorTestDS() {
		LinkedList<Double> runtimes = D1.dataSmooth(shows);

		for (int i = 0; i < runtimes.size(); i++) {
			assertEquals(runtimes.get(i), showResults.get(i), .01);
		}
	}

	@Test
	public void TestIfavgRunTimeWorks() {

		assertEquals(D1.runTime(eps1), 60, 0);
		assertEquals(D1.runTime(eps2), 22.25, 0);
		assertEquals(D1.runTime(eps3), 7, 0);
		assertEquals(D1.runTime(eps4), 58, 0);

//	  assertEquals(D2.runTime(eps1),  60, 0);
//	  assertEquals(D2.runTime(eps2),  22.25, 0);
//	  assertEquals(D2.runTime(eps3),  7, 0);
//	  assertEquals(D2.runTime(eps4),  58, 0);

	}

	@Test
	public void TestIfDataSmoothRuns() {

		assertEquals(D1.dataSmooth(shows), showResults);
		// assertEquals(D2.dataSmooth(shows), showResults);

	}

}

// 					Subtasks

/*
 * 
 * - Make a helper function called runTime -consumes a list of episodes and
 * produces avg run time of episodes -define a double result initially as 0;
 * -define a sum result initially as 0; -process each element in the list using
 * for loop -calculate the average by summing individual runtime of each
 * episodes and divide by no of episodes in the list
 * 
 * 
 * Make the main function named dataSmooth -consumes a list of shows and
 * produces a list of double -Create empty LinkedList<double> result -Create
 * empty LinkedList<double> FinalResult -define a double type finalResult
 * variable initially as 0.0;
 * 
 * -process each show from the input show list using a for loop -set the average
 * length of each show -use setter function given in DataSmooth class. -set
 * average length to average run time of episode list present in that show using
 * helper function runTime -add each average length for particular show to the
 * result double type list
 * 
 * -process each result element from the result list using index-based for loop
 * -For each current index number… -(number + predecessor + successor)/3 -(i +
 * i-1 + i+1)/3 -add the value to the final result list
 * 
 * -add First element to the list using addFirst() -add last element to the list
 * using (result.get(result.size()-1)
 * 
 */