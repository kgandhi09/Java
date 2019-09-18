import java.util.LinkedList;

public class List implements ISet{

	LinkedList<String> list;
	
	public List(LinkedList<String> list) {
		this.list = list;
	}
	
	public List addElt(String guestName) {
	
		this.list.add(guestName);	
		
		return this;
	}
	
	public int size(){
		return this.list.size();
	}
	
	public boolean hasElt(String guestName) {
		boolean result = false;
		
		for(String str: this.list) {
			if(str == guestName) {
				result = true;
			}
			else {
				result = false;
			}
		}
		
		return result;
	}
	
}
