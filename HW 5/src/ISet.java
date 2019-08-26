import java.util.LinkedList;

public interface ISet {

	public void addElt(DailyWeatherReport report);
	
	public double getSumList(String str);
	
	public LinkedList<DailyWeatherReport> getReportList();
	
}
