import java.util.LinkedList;

public class AdvancedRound extends AbsRound{
	
	LinkedList<IContestant> contestants;
	
	public AdvancedRound(LinkedList<Match> matches, LinkedList<IContestant> contestants) {
		super(matches);
		this.contestants = contestants;
		
	}
	
	/*
	public AdvancedRound() {
		super(new LinkedList<Match>());
		this.contestants = new LinkedList<IContestant>();
		
	}
	
	public void addMatch(Match aMatch) {
		this.matches.add(aMatch);
	}
	*/
	
	
}
