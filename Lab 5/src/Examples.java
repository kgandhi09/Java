import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class Examples {

	// EventGuests that uses LinkedLists under the hood

	LinkedList<String> guestList = new LinkedList<String>();
	List list1 = new List(guestList);
	EventGuests guestsList = new EventGuests(list1);

	// an EventGuests that uses BSTs under the hood

	EmptyBST mtbst = new EmptyBST();
	DataBST dataBst1 = new DataBST("guest1", mtbst, mtbst);
	EventGuests guestsBSTs = new EventGuests(dataBst1);

	Examples() {

	}

	@Test
	public void Test1() {

		guestsList.addGuest("Kushal");

		assertEquals(guestsList.isComing("Kushal"), true);

		assertEquals(guestsList.numGuests(), 1);
	}

	@Test
	public void Test2() {

		guestsBSTs.addGuest("Gandhi");
		assertTrue(guestsBSTs.isComing("guest1"));

		assertEquals(guestsBSTs.numGuests(), 2);

	}

}
