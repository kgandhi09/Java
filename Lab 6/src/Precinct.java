import java.util.Scanner;

public class Precinct {

	String PREC_NAME;
	String PREC_ADDR;
	int PREC_POPULATION;
	Scanner keyboard = new Scanner(System.in);
	
	Precinct(String PREC_NAME, String PREC_ADDR, int PREC_POPULATION){
		this.PREC_NAME = PREC_NAME;
		this.PREC_ADDR = PREC_ADDR;
		this.PREC_POPULATION = PREC_POPULATION;
		
		
		
	}
		
	public String toString(Precinct pr) {
	String result = "MT";
	
	result = "Precinct : " + pr.PREC_NAME + "\nAddress : " + pr.PREC_ADDR + "\nPopulatin : " + pr.PREC_POPULATION;
	
	return result;
	}
	
	// Produces precinct with same name and address as this,
	// but with given amount added to the population
	public Precinct grow(int amount) {
		amount = keyboard.nextInt();
		this.PREC_POPULATION += amount;

		System.out.println("\nThe Precinct with new grown population is -");
		Precinct result = new Precinct(this.PREC_NAME, this.PREC_ADDR, amount);
		return result;
		
	}
	
}
