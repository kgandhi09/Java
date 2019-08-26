
public class RugbyTeam implements IContestant{

	String country;
	String jersey_color;
	boolean intimidation_ritual;
	int wins;
	int losses;
	
	public RugbyTeam(String country, String jersey_color, boolean intimidation_ritual, int wins, int losses){
		
		this.country = country;
		this.jersey_color = jersey_color;
		this.intimidation_ritual = intimidation_ritual;
		this.wins = wins;
		this.losses = losses;
		
	}
	
	public boolean expectToBeat(RugbyTeam opponent) {
		

		boolean result = false;
		if(((opponent.intimidation_ritual == true) && (this.intimidation_ritual == true)) || ((opponent.intimidation_ritual == false) && (this.intimidation_ritual == false))) {
			
			int gapOpponent = (opponent.wins - opponent.losses);
			int gapThis = (this.wins - this.losses);
			
			if (gapOpponent > gapThis)
			{
				result = false;
			}
			else
			{
				result = true;
			}
		}
		else if(opponent.intimidation_ritual == false)
		{
			result = true;
		}
		
		else
		{
			result = false;
		}
			
		
		
		
		return result;
		
	}
}
