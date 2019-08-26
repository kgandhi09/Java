import java.util.LinkedList;

public class Reading {
	
	private Time time;
	private double temp;
	private double rainfall;
	
	public Reading(Time time, double temp, double rainfall) {
		this.time = time;
		this.temp = temp;
		this.rainfall = rainfall;
	}
	
	/**getTemp, gets the temp reading of a Reading
	 * @return
	 */
	public double getTemp() {
		return this.temp;
	}
	
	/**getRainfall, gets the rainfall reading of a Reading
	 * @return
	 */
	public double getRainfall() {
		return this.rainfall;
	}
	
}
