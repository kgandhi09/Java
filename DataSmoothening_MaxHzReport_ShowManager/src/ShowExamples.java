import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples {
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();

	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> result = new LinkedList<Show>();
	LinkedList<Show> reportResult = new LinkedList<Show>();

	ShowSummary report1 = new ShowSummary();

	public ShowExamples() {

		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));
		Show s1 = new Show("Star Trek", 1800, eps1, false);
		shows.add(s1);
		report1.primetime.add(s1);

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2, false);
		shows.add(s2);
		report1.primetime.add(s2);

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3, false);
		shows.add(s3);
		report1.daytime.add(s3);

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4, false);
		shows.add(s4);
		report1.daytime.add(s4);

		result.add(s1);
		result.add(s2);
		result.add(s3);
		result.add(s4);

	}

	@Test
	public void TestIfcleanListWorks() {

		assertEquals(sm1.cleanList(shows), result);
		// assertEquals(sm2.isValid(shows), result);
	}

	@Test
	public void instructorTestOrganizeShows() {
		assertEquals(sm1.organizeShows(shows), report1);
		// assertEquals(sm2.organizeShows(shows), report1);
	}

}

//SubTasks

/*
 * Things to note… -Daytime 6am -> 5pm -Primetime 5pm -> 10pm -Late Night 10pm
 * -> 1am -Overnight 1am -> 6am -Specials Anytime
 * 
 * Make a helper function clean-list -consumes a list of shows and produces a
 * list with only non-special shows. -make an empty show-list -Process each show
 * in show-list -If the show is not special -add to show-list
 * 
 * 
 * Make the main organize-show function - consumes a list of shows and produces
 * a ShowSummary type report - make an empty list of shows -make an empty list
 * of shows called cleanList -call the helper function on this list for the
 * input list(consumed by the function organize shows) -after cleaning the input
 * list, process each show of cleanedList using a for loop -If show is from 6am
 * -> 5pm -Add to Daytime LinkedList -If show is from 5pm -> 10pm -Add to
 * Primetime LinkedList -If show is from 10pm -> 1am -Add to LateNight
 * LinkedList
 */