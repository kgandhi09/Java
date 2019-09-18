import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class Examples {

	GregorianCalendar date = new GregorianCalendar(2019, 4, 21);
	LinkedList<Double> TempList = new LinkedList<Double>();
	LinkedList<Double> RainfallList = new LinkedList<Double>();
	
	GregorianCalendar date1 = new GregorianCalendar(2018, 1, 22);
	LinkedList<Double> TempList1 = new LinkedList<Double>();
	LinkedList<Double> RainfallList1 = new LinkedList<Double>();

	DailyWeatherReport report = new DailyWeatherReport(date, TempList, RainfallList);
	DailyWeatherReport report1 = new DailyWeatherReport(date1, TempList1, RainfallList1);
	
	LinkedList<DailyWeatherReport> dailyReportlist = new LinkedList<DailyWeatherReport>();
	dailyReportList dailyReportList = new dailyReportList(dailyReportlist);
	
	LinkedList<DailyWeatherReport> dailyReportlist1 = new LinkedList<DailyWeatherReport>();
	dailyReportList dailyReportList1 = new dailyReportList(dailyReportlist1);
	
	LinkedList<DailyWeatherReport> dailyReportlist2 = new LinkedList<DailyWeatherReport>();
	dailyReportList dailyReportList2 = new dailyReportList(dailyReportlist2);
	
	Time time1 = new Time(10, 20);
	
	Reading reading1 = new Reading(time1, 10, 20);
	LinkedList<Reading> readingList = new LinkedList<Reading>();
	
	WeatherMonitor monitor1 = new WeatherMonitor(dailyReportList);
	WeatherMonitor monitor2 = new WeatherMonitor(dailyReportList1);
	WeatherMonitor monitor3 = new WeatherMonitor(dailyReportList2);
	
	Examples(){
		TempList.add(25.15);
		TempList.add(36.21);
		TempList.add(63.21);
		TempList.add(0.21);
		TempList.add(50.1);
		
		
		RainfallList.add(63.2);
		RainfallList.add(12.22);
		RainfallList.add(15.36);
		RainfallList.add(36.98);
		RainfallList.add(49.63);
		
		dailyReportList.addElt(report);
		
		TempList1.add(65.12);
		TempList1.add(92.12);
		TempList1.add(13.2);
		TempList1.add(16.25);
		TempList1.add(53.01);
		TempList1.add(25.15);
		TempList1.add(36.21);
		TempList1.add(63.21);
		TempList1.add(0.21);
		TempList1.add(50.1);
		
		RainfallList1.add(63.2);
		RainfallList1.add(12.22);
		RainfallList1.add(15.36);
		RainfallList1.add(36.98);
		RainfallList1.add(49.63);
		RainfallList1.add(28.63);
		RainfallList1.add(76.32);
		RainfallList1.add(155.36);
		RainfallList1.add(36.98);
		RainfallList1.add(42.35);
		
		readingList.add(reading1);
		
		dailyReportList1.addElt(report);
		dailyReportList1.addElt(report1);
		
	
	}
	
	@Test
	public void TestForAvgTempForMonth() {
		assertEquals(monitor1.averageTempForMonth(4, 2019), 34.976);
		assertEquals(monitor2.averageTempForMonth(4, 2019), 34.976);
		assertEquals(monitor2.averageTempForMonth(1, 2018), 41.45799999999999);
		
	}
	
	@Test
	public void TestForTotalRainfallForMonth() {
		assertEquals(monitor1.totalRainfallForMonth(4, 2019), 177.39);
		assertEquals(monitor2.totalRainfallForMonth(4, 2019), 177.39);
		assertEquals(monitor2.totalRainfallForMonth(1, 2018), 517.03);
	}
	
	@Test
	public void TestForAddDailyReport() {
		monitor3.addDailyReport(date1, readingList);
		assertEquals(monitor3.averageTempForMonth(1, 2018), 10);
		
	}
	
	
	}


