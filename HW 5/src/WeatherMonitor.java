import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * @author Kushal
 *
 */
public class WeatherMonitor {

	private ISet dailyReports;

	public WeatherMonitor(ISet dailyReports) {

		this.dailyReports = dailyReports;

	}

	/**getListofTemp, consumes a list of readings, get each temp reading from one reading, makes a list of tempreadings 
	 * @param listOfReadings, list of readings
	 * @return, a list of temperature
	 */
	public LinkedList<Double> getListOfTemp(LinkedList<Reading> listOfReadings) {
		LinkedList<Double> result = new LinkedList<Double>();
		for (int i = 0; i < listOfReadings.size(); i++) {

			result.add(listOfReadings.get(i).getTemp());
		}

		return result;
	}

	/**getListofTemp, consumes a list of readings, get each rainfall reading from one reading, makes a list of rainfallReadings 
	 * @param listOfReadings, list of readings
	 * @return, a list of Rainfall
	 */
	public LinkedList<Double> getListOfRainfall(LinkedList<Reading> listOfReadings) {
		LinkedList<Double> result = new LinkedList<Double>();

		for (int i = 0; i < listOfReadings.size(); i++) {

			result.add(listOfReadings.get(i).getTemp());
		}

		return result;
	}

	/**averageTempForMonth, calculates average temperature of a given month and year
	 * @param month, month for which the average has to be calculated
	 * @param year, year for which the average has to be calculated
	 * @return, double type average of all double type temp readings
	 */
	public double averageTempForMonth(int month, int year) {
		double result = 0.0;
		double sum = 0;
		int count = 0;
		
		for(DailyWeatherReport report : this.dailyReports.getReportList()) {
			if(month == report.extractMonth() && year == report.extractYear()) {
				sum += report.getSumTemp();
				count += report.getCountTemp();
			}

		}
		
		result = sum/count;
		return result;
	}

	/**totalRainfallForMonth, calculates total rainfall of a given month and year
	 * @param month, month for which the total has to be calculated
	 * @param year, year for which the total has to be calculated
	 * @return, double type total of all double type rainfall readings
	 */
	public double totalRainfallForMonth(int month, int year) {
		double sum = 0.0;
		
		for(DailyWeatherReport report : this.dailyReports.getReportList()) {
			if(year == report.extractYear() && month == report.extractMonth()) {
				sum += report.getSumRainfall();
			}
			
		}
		

		return sum;
	}

	/**addDailyReport, adds a report to ISet dailyRportList
	 * @param date
	 * @param readings
	 */
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		LinkedList<Double> ListOfTemp = this.getListOfTemp(readings);
		LinkedList<Double> ListOfRainfall = this.getListOfRainfall(readings);
		DailyWeatherReport result = new DailyWeatherReport(date, ListOfTemp, ListOfRainfall);
		this.dailyReports.addElt(result);

	}

}
