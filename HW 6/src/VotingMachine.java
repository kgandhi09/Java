import java.util.Scanner;

public class VotingMachine {

	private Scanner keyboard;
	ElectionData electionData;

	VotingMachine(ElectionData electionData) {
		this.electionData = electionData;
		keyboard = new Scanner(System.in);
	}

	public void screen() {
		electionData.printBallot();
		System.out.println("Welcome to the Voting Machine ");
		System.out.println("Enter your most preferred Candidate - ");
		String candidate1 = keyboard.next();
		System.out.println("Enter your second most preferred Candidate - ");
		String candidate2 = keyboard.next();
		System.out.println("Enter your least preferred Candidate - ");
		String candidate3 = keyboard.next();
		
		this.processVote(candidate1, candidate2, candidate3);
		
		System.out.println("\nYou Voted For - " + "\nFirst Prefernce - " + candidate1 + "\nSecond Prefernce - "
				+ candidate2 + "\nThird Prefernce - " + candidate3);

		
		
		
	}

	
	private void processVote(String candidate1,String candidate2, String candidate3 ) {
		try {
			electionData.processVote(candidate1, candidate2, candidate3);
		}
		catch (UnknownCandidateException e) {
			System.out.println(e.getMessage());
			System.out.println("Would you like to add the candidate in the ballot? (Please Enter Y/y )");
			String keyInput = this.keyboard.next();
						if (keyInput.equals("Y") || keyInput.equals("y")) {

				try {
					this.addWriteIn(e.getUnknownCandidate());
					System.out.print("The Candidate(s) is/are added successfully! ");
					this.processVote(candidate1, candidate2, candidate3);
					
				} catch (CandidateExistsException e1) {
					System.out.println("The Candidate already exists!");
				}
			}
		} catch (DuplicateVotesException e) {
			System.out.println("The Candidate" + e.getDuplicateCandidate() + "is already in the list !");
		}
	}
	
	
	public void addWriteIn(String name) throws CandidateExistsException {
		this.electionData.addCandidate(name);
	}

}
