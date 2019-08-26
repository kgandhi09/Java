import java.util.LinkedList;

public class Planning2 {

LinkedList<Double> rainData;
	
	public Planning2(LinkedList<Double> rainData) {
		this.rainData = rainData;
		
		
	}
	
	public LinkedList<Double> rainfall2() {
		LinkedList<Double> cleanedData = new LinkedList<Double>();
		
		for(Double d : this.rainData) {
			if(d == -999) {
				return cleanedData;
			}
			else if(d>0) {
				
				cleanedData.add(d);
				
			}
			
			
		}
		
		return cleanedData;
	}
	
	public double rainfall2(LinkedList<Double> raindata) {
		LinkedList<Double> cleanedData = new LinkedList<Double>();
		double sum = 0;
		
		for(Double d : cleanedData) {
			sum = sum + d;
		}
		if(cleanedData.size() > 0) {
			return sum/cleanedData.size();
		}
		else {
			return -1;
		}
	}
}
