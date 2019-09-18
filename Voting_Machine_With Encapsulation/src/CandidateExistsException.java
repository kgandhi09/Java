
public class CandidateExistsException extends Exception{

	private String candidateExists;
	
	CandidateExistsException(String candidateExists){
		this.candidateExists = candidateExists;
	}
	
	public String getExistedName() {
		return this.candidateExists;
	}
	
}
