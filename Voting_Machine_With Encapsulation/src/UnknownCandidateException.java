
public class UnknownCandidateException extends Exception {
	private String unknownCandidate;
	
	UnknownCandidateException(String unknownCandidate) {
		super("\nCandidate " + unknownCandidate + " doesn't exist!");
		this.unknownCandidate = unknownCandidate;
	}
	
	public String getUnknownCandidate() {
		return this.unknownCandidate;
	}

}
