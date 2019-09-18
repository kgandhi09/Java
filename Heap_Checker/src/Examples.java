import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Examples {

	MtHeap mtheap = new MtHeap();
	MtBT mtbt = new MtBT();
	HeapTester check = new HeapTester();

	// Bt
	DataBT bt1 = new DataBT(0, mtbt, mtbt);

	// Bt with left child empty
	DataBT bt3 = new DataBT(2, mtbt, mtbt);
	DataBT bt2 = new DataBT(1, mtbt, bt3);

	DataBT bt4 = new DataBT(1, mtbt, mtbt);
	DataBT bt5 = new DataBT(2, mtbt, bt3);

	// Bt with right child empty
	DataBT bt6 = new DataBT(2, mtbt, mtbt);
	DataBT bt7 = new DataBT(1, bt6, mtbt);

	DataBT bt8 = new DataBT(1, mtbt, mtbt);
	DataBT bt9 = new DataBT(2, bt6, mtbt);

	// Bt with left and right child upto height 2
	DataBT bt10 = new DataBT(2, mtbt, mtbt);
	DataBT bt11 = new DataBT(3, mtbt, mtbt);
	DataBT bt12 = new DataBT(1, bt11, bt10);

	DataBT bt13 = new DataBT(2, mtbt, mtbt);
	DataBT bt14 = new DataBT(1, mtbt, mtbt);
	DataBT bt15 = new DataBT(3, bt11, bt10);

	// Bt with left and right child upto height 3
	DataBT bt16 = new DataBT(4, mtbt, mtbt);
	DataBT bt17 = new DataBT(5, mtbt, mtbt);
	DataBT bt18 = new DataBT(6, mtbt, mtbt);
	DataBT bt19 = new DataBT(7, mtbt, mtbt);
	DataBT bt20 = new DataBT(2, bt16, bt17);
	DataBT bt21 = new DataBT(3, bt18, bt19);
	DataBT bt22 = new DataBT(1, bt20, bt21);

	DataBT bt23 = new DataBT(4, mtbt, mtbt);
	DataBT bt24 = new DataBT(7, mtbt, mtbt);
	DataBT bt25 = new DataBT(1, mtbt, mtbt);
	DataBT bt26 = new DataBT(5, mtbt, mtbt);
	DataBT bt27 = new DataBT(3, bt16, bt17);
	DataBT bt28 = new DataBT(2, bt18, bt19);
	DataBT bt29 = new DataBT(6, bt20, bt21);

//----------------------------------------------------------------------------------------------------------------

	// Heap
	DataHeap heap1 = new DataHeap(0, mtheap, mtheap);

	// heap with left child empty
	DataHeap heap3 = new DataHeap(2, mtheap, mtheap);
	DataHeap heap2 = new DataHeap(1, mtheap, heap3);

	DataHeap heap4 = new DataHeap(1, mtheap, mtheap);
	DataHeap heap5 = new DataHeap(2, mtheap, heap3);

	// heap with right child empty
	DataHeap heap6 = new DataHeap(2, mtheap, mtheap);
	DataHeap heap7 = new DataHeap(1, heap6, mtheap);

	DataHeap heap8 = new DataHeap(1, mtheap, mtheap);
	DataHeap heap9 = new DataHeap(2, heap6, mtheap);

	// heap with left and right child upto height 2
	DataHeap heap10 = new DataHeap(2, mtheap, mtheap);
	DataHeap heap11 = new DataHeap(3, mtheap, mtheap);
	DataHeap heap12 = new DataHeap(1, heap11, heap10);

	DataHeap heap13 = new DataHeap(2, mtheap, mtheap);
	DataHeap heap14 = new DataHeap(1, mtheap, mtheap);
	DataHeap heap15 = new DataHeap(3, heap11, heap10);

	// heap with left and right child upto height 3
	DataHeap heap16 = new DataHeap(4, mtheap, mtheap);
	DataHeap heap17 = new DataHeap(5, mtheap, mtheap);
	DataHeap heap18 = new DataHeap(6, mtheap, mtheap);
	DataHeap heap19 = new DataHeap(7, mtheap, mtheap);
	DataHeap heap20 = new DataHeap(2, heap16, heap17);
	DataHeap heap21 = new DataHeap(3, heap18, heap19);
	DataHeap heap22 = new DataHeap(1, heap20, heap21);

	DataHeap heap23 = new DataHeap(4, mtheap, mtheap);
	DataHeap heap24 = new DataHeap(7, mtheap, mtheap);
	DataHeap heap25 = new DataHeap(1, mtheap, mtheap);
	DataHeap heap26 = new DataHeap(5, mtheap, mtheap);
	DataHeap heap27 = new DataHeap(3, heap16, heap17);
	DataHeap heap28 = new DataHeap(2, heap18, heap19);
	DataHeap heap29 = new DataHeap(6, heap20, heap21);

	@Test
	public void TestForIsHeap() {
		assertEquals(mtheap.isHeap(), true);

		assertEquals(bt2.isHeap(), true);
		assertEquals(bt5.isHeap(), false);

		assertEquals(bt7.isHeap(), true);
		assertEquals(bt9.isHeap(), false);

		assertEquals(bt12.isHeap(), true);
		assertEquals(bt15.isHeap(), false);

		assertEquals(bt22.isHeap(), true);
		assertEquals(bt29.isHeap(), false);

	}

	@Test
	public void TestForHasEltInHeap() {

		assertEquals(bt2.hasEltInHeap(bt5), true);
		assertEquals(bt7.hasEltInHeap(bt9), true);
		assertEquals(bt12.hasEltInHeap(bt15), true);
		assertEquals(bt22.hasEltInHeap(bt29), true);

	}

	@Test
	public void TestForaddEltTester() {

		assertEquals(check.addEltTester(heap1, 4, heap1.addElt(4)), true);
		assertEquals(check.addEltTester(heap2, 4, heap2.addElt(4)), true);
		assertEquals(check.addEltTester(heap7, 8, heap7.addElt(8)), true);
		assertEquals(check.addEltTester(heap12, 3, heap12.addElt(3)), true);
		assertEquals(check.addEltTester(heap22, 20, heap22.addElt(20)), true);
		assertEquals(check.addEltTester(heap9, 100, heap9.addElt(100)), true);
		assertEquals(check.addEltTester(heap29, 4, heap29.addElt(4)), true);
		

	}

	@Test
	public void TestForRemMinEltTester() {

		assertEquals(check.remMinEltTester(heap1, heap1.remMinElt()), true);
		assertEquals(check.remMinEltTester(heap2, heap2.remMinElt()), true);
		assertEquals(check.remMinEltTester(heap7, heap7.remMinElt()), true);
		assertEquals(check.remMinEltTester(heap12, heap12.remMinElt()), true);
		assertEquals(check.remMinEltTester(heap22, heap22.remMinElt()), true);
		assertEquals(check.remMinEltTester(heap9, heap9.remMinElt()), false);
		assertEquals(check.remMinEltTester(heap29, heap29.remMinElt()), false);
	}
}
