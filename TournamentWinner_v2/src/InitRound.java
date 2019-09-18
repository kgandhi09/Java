import java.util.LinkedList;

public class InitRound extends AbsRound{
	
	
	public InitRound(LinkedList<Match> matches) {
		super(matches);
	}
	
	/*
	public InitRound() {
		super(new LinkedList<Match>()); 
	}
	
	public void addMatch(Match aMatch) {
		this.matches.add(aMatch);
	}
	*/
	
	public boolean isWinner(IContestant contestant) {
		
		boolean result = false;
		int count = 0;
		
		for(Match match : this.matches) {
			
			if(contestant.equals(match.winner() )) {
				count++;
				}
			
		}
		if(count >= 1) {
			result= true;
		}
		
		return result;
	} 
	
	
}
