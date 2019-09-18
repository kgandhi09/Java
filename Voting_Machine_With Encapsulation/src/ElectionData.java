import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class ElectionData {
	LinkedList<String> ballot = new LinkedList<String>();
	LinkedList<String> votes = new LinkedList<String>();
	Scanner keyboard = new Scanner(System.in);
	private int noOfVoters = 0;

	// hashmap votes1- for 1st preference
	// Integer - no of votes for candidate(String) in 1st preference
	private HashMap<String, Integer> votes1 = new HashMap<String, Integer>();
	// hashmap votes2- for 2nd preference
	// Integer - no of votes for candidate(String) in 2nd preference
	private HashMap<String, Integer> votes2 = new HashMap<String, Integer>();
	// hashmap votes3- for 3rd preference
	// Integer - no of votes for candidate(String) in 3rd preference
	private HashMap<String, Integer> votes3 = new HashMap<String, Integer>();

	ElectionData() {
//    this.ballot.add("Gompei");
//    this.ballot.add("Husky");

	}

	public void printBallot() {
		System.out.println("The candidates are ");
		for (String s : this.ballot) {
			System.out.println(s);
		}
	}

	public void screen() {
		this.printBallot();
		System.out.println("Who do you want to vote for?");
		String candidate = keyboard.next();
		votes.add(candidate);
		System.out.println("You voted for " + candidate);
	}

	public int countVotes(String forcand) {
		int numvotes = 0;
		for (String s : votes) {
			if (s.equals(forcand))
				numvotes = numvotes + 1;
		}
		return numvotes;
	}

	public void processVote(String firstChoice, String secondChoice, String thirdChoice)
			throws DuplicateVotesException, UnknownCandidateException {
		if (firstChoice.equals(thirdChoice) || thirdChoice.equals(firstChoice)) {
			throw new DuplicateVotesException(firstChoice);
		}
		if (secondChoice.equals(thirdChoice)) {
			throw new DuplicateVotesException(secondChoice);
		}
		if (!ballot.contains(firstChoice)) {
			throw new UnknownCandidateException(firstChoice);
		}
		if (!ballot.contains(secondChoice)) {
			throw new UnknownCandidateException(secondChoice);
		}
		if (!ballot.contains(thirdChoice)) {
			throw new UnknownCandidateException(thirdChoice);
		}

		this.votes1.put(firstChoice, this.votes1.get(firstChoice) + 1);
		this.votes2.put(secondChoice, this.votes2.get(secondChoice) + 1);
		this.votes3.put(thirdChoice, this.votes3.get(thirdChoice) + 1);

		this.noOfVoters += 1;

	}

	public void addCandidate(String name) throws CandidateExistsException {
		if (this.ballot.contains(name)) {
			throw new CandidateExistsException(name);
		} else {
			this.ballot.add(name);
			this.votes1.put(name, 0);
			this.votes2.put(name, 0);
			this.votes3.put(name, 0);
		}
	}

	public String findWinnerMostFirstVotes() {
		String result = "Runoff Required";
		for (String name : this.ballot) {
			if (this.votes1.get(name) > 0.5 * (this.noOfVoters)) {
				result = name;
			}
		}
		return result;
	}

	public String findWinnerMostPoints() {
		String result = "MT";
		int max = 0;

		for (int i = 0; i < this.ballot.size(); i++) {
			int points = (this.votes1.get(ballot.get(i)) * 3) + (this.votes2.get(ballot.get(i)) * 2)
					+ this.votes3.get(ballot.get(i));
			// int nxtPoints = (this.votes1.get(ballot.get(i+1))*3) +
			// (this.votes2.get(ballot.get(i+1))*2) + this.votes3.get(ballot.get(i+1));
			if (points > max) {

				result = this.ballot.get(i);
			}

		}

		return result;

	}

}
