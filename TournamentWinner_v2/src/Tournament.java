import java.util.LinkedList;

public class Tournament {

	LinkedList<AbsRound> round;
	IWinner winner;

	public Tournament(LinkedList<AbsRound> round) {

		this.round = round;
	}
	
	/*
	public Tournament() {
		this.round = new LinkedList<AbsRound>();
	}
	
	public void addRound(AbsRound aRound) {
		round.add(aRound);
	}
	*/

	public boolean finalWinnerIsValid(IContestant contestant) {
		boolean result = false;
		int count = 0;

		for (IWinner winners : this.round) {

			if (winners.isWinner(contestant)) {
				count++;

			}

		}

		if (count >= (round.size() / 2)) {
			result = true;
		}

		return result;
	}
}
