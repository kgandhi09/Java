import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {

	private GregorianCalendar date;
	private LinkedList<Double> tempReading;
	private LinkedList<Double> rainfallReading;
	
	public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReading, LinkedList<Double> rainfallReading) {
		this.date = date;
		this.tempReading = tempReading; 
		this.rainfallReading = rainfallReading;
		
	}
	
	/**extractMonth, extracts a month from a grogoriancalendar date
	 * @return
	 */
	public int extractMonth() {
		int result = 0;
		result = this.date.get(GregorianCalendar.MONTH);
		return result;
	}
	
	/**extractMonth, extracts a year from a grogoriancalendar date
	 * @return
	 */
	public int extractYear() {
		int result = 0;
		result = this.date.get(GregorianCalendar.YEAR);
		return result;
	}
	
	/**getCountTemp, gets the number of temp reading in Reading
	 * @return
	 */
	public int getCountTemp() {
		return this.tempReading.size();
	}

	/**getSumTemp, calculates the total of all temp readings
	 * @return
	 */
	public double getSumTemp() {
		double result = 0.0 ;
		
		for(Double tempData : this.tempReading) {
			result += tempData;
		}
		
		return result;
	}
	
	/**getSumTemp, calculates the total of all rainfall readings
	 * @return
	 */
	public double getSumRainfall() {
		double result = 0.0 ;
		
		for(Double rainData : this.rainfallReading) {
			result += rainData;
		}
		
		return result;
	}
	
	
}
