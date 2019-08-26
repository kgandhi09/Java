
public class RugbyResult implements IResult {

	RugbyTeam team1;
	RugbyTeam team2;
	double team1points;
	double team2point;
	
	
	public RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1points, double team2point) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.team1points = team1points;
		this.team2point = team2point;
		
	}
	
	public boolean isValid() {
		
		if((team1points < 150) && (team2point < 150))
		{return true;} 
		else
		{ return false;}
		
		}
	
	public RugbyTeam getWinner() {
		
	
		RugbyTeam winnerRugby = team1;	
		
		
			if(team1points > team2point)
			{
				winnerRugby = team1;
			}
			else
			{
				winnerRugby = team2;
			}
		
		
		return winnerRugby;
		
	}
}
