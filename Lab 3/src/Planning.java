import java.util.LinkedList;

public class Planning {

	LinkedList<Double> newDouble;
	
	public Planning(LinkedList<Double> newDouble) {
		this.newDouble = newDouble;
		
		
	}
	
	
	
	public double rainfall() {
		double result  = 0.0;
		int count = 0;
		double sum = 0;
		
		for(Double x: this.newDouble) {
			if(x != -999.0) {
				if(x > 0) {
					sum += x;
					count++;
				
				}
			}
			else{
				break;
			}
		}
		
		if(count == 0) {
			result = -1;
		}
		else {
			result = (sum/count);
		}
			
		return result;
	}
		
}

