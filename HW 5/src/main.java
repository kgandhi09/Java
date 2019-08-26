import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			}

	
	public static double sum1(LinkedList<Double> data) {
		double result = 0.0;
		
		for(int i = 0; i < data.size(); i++) {
			result += data.get(i);
		}
		
		return result;
	}
}
