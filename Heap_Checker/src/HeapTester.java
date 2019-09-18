
public class HeapTester{
		
	
	public HeapTester() {
	
	}

	public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		/**
		 * addEltTester
		 * @param hOrig -> is the original heap
		 * @param elt -> element that is to be added the original heap
		 * @param hAdded  -> possible result of the addition of element to original heap
		 * @return true if the binTree hAdded is a valid result of addition of the element elt
		 * in the heap hOrig
		 */
		boolean result = false;
		if(hAdded.isHeap() && hAdded.size() == hOrig.size() + 1) {
			if( hAdded.hasElt(elt) && hAdded.hasEltInHeap(hOrig)) {
				result = true;
			}
			else {
				result = false;
			}
		}

		return result;
	}
	
	public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
		/**

		  * remMinEltTester
		  * @param hOrig -> is the original heap
		  * @param hRemoved -> possible result of removal of the original heap's smallest element
		  * @return true if the binTree hRemoved is a valid result of removal of heap hOrig's 
		  * smallest element
		  */
		boolean result = false;
		if(hOrig.size() -1 == hRemoved.size() && !(hRemoved.hasElt(hOrig.getData()))){
			result = hRemoved.isHeap() && hRemoved.hasEltInHeap(hOrig.getLeft()) && hRemoved.hasEltInHeap(hOrig.getRight());
		}
		
		return result;
	}
	
}
