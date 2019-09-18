
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmptyBST mtbst = new EmptyBST();
		DataBST dataBst1 = new DataBST("k", mtbst, mtbst);
		dataBst1.addElt("K");
		
		System.out.print(dataBst1.size());
		
		
	}

}
