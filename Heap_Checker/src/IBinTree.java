import java.lang.Math;

interface IBinTree {
	// determines whether element is in the tree
	boolean hasElt(int e);

	// returns number of nodes in the tree; counts duplicate elements as separate
	// items
	int size();

	// returns depth of longest branch in the tree
	int height();

	int getData();

	IBinTree getLeft();

	IBinTree getRight();

	boolean isHeap();

	boolean hasEltInHeap(IBinTree tree);

	// boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded);

}

class MtBT implements IBinTree {
	MtBT() {
	}

	// returns false since empty tree has no elements
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since enpty tree has no elements
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	public int height() {
		return 0;
	}

	public int getData() {
		return 0;
	}

	public MtBT getLeft() {
		return (new MtBT());
	}

	public MtBT getRight() {
		return (new MtBT());
	}

	public boolean isHeap() {
		return true;
	}

	public boolean hasEltInHeap(IBinTree tree) {
		if(tree.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		return true;
	}

	public int minElt() {
		return this.getData();
	}
}

class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// an alternate constructor for when both subtrees are empty
	DataBT(int data) {
		this.data = data;
		this.left = new MtBT();
		this.right = new MtBT();
	}

	// determines whether this node or node in subtree has given element
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}

	public int getData() {
		return this.data;
	}

	public IBinTree getLeft() {
		return this.left;
	}

	public IBinTree getRight() {
		return this.right;
	}

	public boolean isHeap() {
	/**isheap
	* returns true if the current binTree is a heap and satisfies all its properties
	*/
		boolean result = false;

		if (left.size() == 0 && right.size() == 0) {
			result = true;
		}
		if (left.size() != 0 && right.size() == 0) {
			result = this.data < this.left.getData() && this.left.isHeap();
		}
		if (left.size() == 0 && right.size() != 0) {
			result = this.data < this.right.getData() && this.right.isHeap();
		}
		if (left.size() != 0 && right.size() != 0) {

			if (this.data < this.left.getData() && this.data < this.right.getData()) {
				result = this.left.isHeap() && this.right.isHeap();
			} 
		}

		return result;

	}

	public boolean hasEltInHeap(IBinTree tree) {

		 /**hasEltInHeap
		  * @param: takes in a heap
		  * returns true if all the elements in the given heap are there in the current binTree
		  * false, otherwise
		  */
		
		boolean result = false;

		if(tree.size() == 0) {
			result = true;
		}
		else if(tree.getLeft().size() == 0 && tree.getRight().size() == 0) {
			result = this.hasElt(tree.getData());
		}
		else if(tree.getLeft().size() != 0 && tree.getRight().size() == 0) {
			result = this.hasElt(tree.getData()) && this.hasEltInHeap(tree.getLeft());
		}
		if(tree.getLeft().size() == 0 && tree.getRight().size() != 0) {
			result = this.hasElt(tree.getData()) && this.hasEltInHeap(tree.getRight());
		}
		if(tree.getLeft().size() != 0 && tree.getRight().size() != 0) {
			result = this.hasElt(tree.getData()) && this.hasEltInHeap(tree.getLeft()) && this.hasEltInHeap(tree.getRight());
		}

		return result;
	}

}