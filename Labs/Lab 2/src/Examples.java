
import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
	Shark shark1=new Shark(7,10);
	Fish fish1=new Fish(2,9.5);
	
	

    public Examples(){
    	
    }
    
    
    // This shows what a test case looks like
    @Test 
    public void isNormalTest() {
   
	assertTrue(shark1.isNormalSize());
    }
  
  
}
