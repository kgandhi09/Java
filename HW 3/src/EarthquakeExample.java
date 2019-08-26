import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class EarthquakeExample {

	Earthquake1 E1 = new Earthquake1();
	Earthquake2 E2 = new Earthquake2();

	LinkedList<Double> data = new LinkedList<Double>();
	LinkedList<Double> data2 = new LinkedList<Double>();
	LinkedList<Double> data4 = new LinkedList<Double>();
	LinkedList<Double> data5 = new LinkedList<Double>();
	LinkedList<Double> data6 = new LinkedList<Double>();
	
	LinkedList<MaxHzReport> result = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> result2 = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> result3 = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> result4 = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> result5 = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> result6 = new LinkedList<MaxHzReport>();
	
	EarthquakeExample(){
		//Normal list
		data.add(20151104.0);
		data.add(200.0);
		data.add(150.0);
		data.add(175.0);
		data.add(20151105.0);
		data.add(0.002);
		data.add(0.03);
		data.add(20151107.0);
		data.add(130.0);
		data.add(0.54);
		data.add(20151101.0);
		data.add(78.0);
		
		//list with only dates and no data
		data2.add(20151004.0);
		data2.add(20151005.0);
		data2.add(20151007.0);
		data2.add(20151001.0);
		
		//list starting with data but not date
		data4.add(200.0);
		data4.add(150.0);
		data4.add(175.0);
		data4.add(20151105.0);
		data4.add(0.002);
		data4.add(0.03);
		data4.add(20151107.0);
		data4.add(130.0);
		data4.add(0.54);
		data4.add(20151101.0);
		data4.add(78.0);
		
		//list ending with date but not data
		data5.add(20151104.0);
		data5.add(200.0);
		data5.add(150.0);
		data5.add(175.0);
		data5.add(20151105.0);
		data5.add(0.002);
		data5.add(0.03);
		data5.add(20151107.0);
		data5.add(130.0);
		data5.add(0.54);
		data5.add(20151101.0);

		result.add(new MaxHzReport(20151104.0, 200.0));
		result.add(new MaxHzReport(20151105.0, 0.03));
		result.add(new MaxHzReport(20151107.0, 130.0));
		result.add(new MaxHzReport(20151101.0, 78.0));
	
		result2.add(new MaxHzReport(20151004.0, 0.0));
		result2.add(new MaxHzReport(20151005.0, 0.0));
		result2.add(new MaxHzReport(20151007.0, 0.0));
		result2.add(new MaxHzReport(20151001.0, 0.0));

		result4.add(new MaxHzReport(20151105.0, 0.03));
		result4.add(new MaxHzReport(20151107.0, 130.0));
		result4.add(new MaxHzReport(20151101.0, 78.0));

		result5.add(new MaxHzReport(20151104.0, 200.0));
		result5.add(new MaxHzReport(20151105.0, 0.03));
		result5.add(new MaxHzReport(20151107.0, 130.0));
		result5.add(new MaxHzReport(20151101.0, 0.0));
	
	}

	@Test
	public void test() {
		assertEquals(E1.dailyMaxForMonth(data, 11), result);
		assertEquals(E2.dailyMaxForMonth(data, 11), result);

	}
	
	@Test
	public void test2() {
		assertEquals(E1.dailyMaxForMonth(data2, 10), result2);
		assertEquals(E2.dailyMaxForMonth(data2, 10), result2);

	}
	
	@Test
	public void test3() {
		assertEquals(E1.dailyMaxForMonth(data2, 11), result3);
		assertEquals(E2.dailyMaxForMonth(data2, 11), result3);

	}
	
	@Test
	public void test4() {
		assertEquals(E1.dailyMaxForMonth(data4, 11), result4);
		assertEquals(E2.dailyMaxForMonth(data4, 11), result4);

	}
	
	@Test
	public void test5() {
		assertEquals(E1.dailyMaxForMonth(data5, 11), result5);
		assertEquals(E2.dailyMaxForMonth(data5, 11), result5);

	}
	
	@Test
	public void test6() {
		assertEquals(E1.dailyMaxForMonth(data6, 11), result6);
		assertEquals(E2.dailyMaxForMonth(data6, 11), result6);

	}

}

//				SubTasks

/*
 * Make a function called dailyMaxForMonth -consumes a list of double type data
 * and a month and produces a list of MaxHzReport - make an empty result list of
 * type MaxHzReport
 * 
 * - process each element of the loop using index based for loop -If current
 * data is a date -then extract month from the date and if it is equal to input
 * month - process each element after date by mutating the index to i + 1 -if
 * next element is not a data -check for max value till the next date comes - if
 * next element is a date break this loop and send this element to the previous
 * loop by mutating index value to i-1 -if extracted month is not the correct
 * month -then skip tha data
 * 
 */
