
public class RoboticsTeam implements IContestant{

	String school;
	String special_feature;
	int rank;
	
	public RoboticsTeam(String school, String special_feature, int rank) {
		
		this.school = school;
		this.special_feature = special_feature;
		this.rank = rank;
		
	}
	
	public boolean expectToBeat(RoboticsTeam opponent) {
		
		boolean result = false;
		
		if (opponent.rank > this.rank)
		{
			result = false;
		}
		else
		{
			result = true;
		}
		
		return result;
	}
	
}
