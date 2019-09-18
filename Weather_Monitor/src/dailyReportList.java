import java.util.LinkedList;

public class dailyReportList implements ISet {

	private LinkedList<DailyWeatherReport> dailyReportList;

	dailyReportList(LinkedList<DailyWeatherReport> dailyReportList) {

		this.dailyReportList = dailyReportList;

	}
	
	/**getReportList, gets a list of daily weather reports of daily report lists
	 *
	 */
	public LinkedList<DailyWeatherReport> getReportList(){
		return this.dailyReportList;
	}

	/**getSumList, calculates the total of all temp or rainfall readings in a Reading in list of Readings
	 *@param, string which will decided whether to compute the method for temp or rainfall 
	 */
	public double getSumList(String str){
		double result = 0.0;

		if (str.equals("temp")) {
			for (DailyWeatherReport report : this.dailyReportList) {
				result += report.getSumTemp();
			}
		} else if (str.equals("rainfall")) {
			for (DailyWeatherReport report : this.dailyReportList) {
				result += report.getSumRainfall();
			}
		}
		return result;
	}

	/**addElt, adds an element to the list
	 *@param report, daily weather report
	 */
	public void addElt(DailyWeatherReport report) {
		this.dailyReportList.add(report);
	}

}
