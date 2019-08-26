 
public class RoboticsResult implements IResult{

	RoboticsTeam team1;
	RoboticsTeam team2;
	double team1points;
	int team1tasks;
	boolean team1fell;
	double team2points;
	int team2tasks;
	boolean team2fell;
	
	public RoboticsResult(RoboticsTeam team1, RoboticsTeam team2, double team1points, int team1tasks, boolean team1fell, double team2points, int team2tasks, boolean team2fell) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.team1points = team1points;
		this.team1tasks = team1tasks;
		this.team1fell = team1fell;
		this.team2points = team2points;
		this.team2tasks = team2tasks;
		this.team2fell = team2fell;
		
	}
	
	public boolean isValid() {
		boolean result=false;
		
		if((team1tasks < 8) && (team2tasks < 8))
		{
			if((team1points <= 16) && (team2points <= 16))
			{result= true;}
			else 
			{result= false;}
		}
		return result;
		
	}
	
	public double getScore(double points, int tasks, boolean fellDown) {
		
		double finalScore =  (points + tasks);
		
		if(fellDown == true)
		{
			finalScore = (finalScore - 5); 
		}
		else
		{
			finalScore = (points +tasks);
		}
		
		return finalScore;
	
	}
	
	public RoboticsTeam getWinner() {
		
		RoboticsTeam winnerRobotics = team1;
			
		if(getScore(team1points, team1tasks, team1fell) > getScore(team2points, team2tasks, team2fell))
		{
			winnerRobotics = team1;
		}
		else
		{
			winnerRobotics = team2;
		}
		return winnerRobotics;
	}
	
}
