import java.util.LinkedList;

public abstract class AbsRound implements IWinner{

	LinkedList<Match> matches;

	public AbsRound(LinkedList<Match> matches) {
		this.matches = matches;
	}

	public LinkedList<IContestant> getMatchWinners() {

		LinkedList<IContestant> result = new LinkedList<IContestant>();

		for (Match match : this.matches) {

			if (match.winner() != null) {
				result.add(match.winner());
			}

		}

		return result;
	}

	public int getNumWinners() {

		LinkedList<IContestant> winners = this.getMatchWinners();
		return winners.size();

	}

	public boolean isWinner(IContestant contestant) {
		boolean result = false;

		for (Match match : this.matches) {

			if (contestant.equals(match.winner())) {

				result = true;
			}

		}

		return result;
	}
}
