import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PlanningTest {

	LinkedList<Double> list1 = new LinkedList<Double>();
	LinkedList<Double> list2 = new LinkedList<Double>();
	LinkedList<Double> list3 = new LinkedList<Double>();
	
	Planning planning1 = new Planning(list1);
	Planning planning2 = new Planning(list2);
	Planning planning3 = new Planning(list3);
	
	public PlanningTest() {
		
		list1.add(1.0);
		list1.add(-2.0);
		list1.add(5.0);
		list1.add(-999.0);
		list1.add(8.0);
		
		list2.add(-999.0);
		list2.add(-2.0);
		list2.add(5.0);
		
		list3.add(14.5);
		list3.add(12.2);
		list3.add(5.0);
		list3.add(-25.6);
		list3.add(15.6);
		list3.add(-59.6);
	}

	@Test
	void TestIfPlanningWorks() {
		assertEquals(planning1.rainfall(), 3.0);
		assertEquals(planning2.rainfall(), -1);
		assertEquals(planning3.rainfall(), 11.825);
		
	}

}
