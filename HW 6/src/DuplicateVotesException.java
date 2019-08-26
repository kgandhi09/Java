
public class DuplicateVotesException extends Exception{

	private String duplicateCandidate;
	
	DuplicateVotesException(String duplicateCandidate){
		this.duplicateCandidate = duplicateCandidate;
	}
	
	public String getDuplicateCandidate() {
		return this.duplicateCandidate;
	}
}
