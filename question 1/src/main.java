import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("In main!");
		Scanner scanner = new Scanner(System.in);
		//int noOfTestCases = scanner.nextInt();
		String strS = scanner.nextLine();
		strS = strS + "1";
		LinkedList<Integer> depth = nestingDepth(strS);
		
		System.out.println(depth);
	}

	public static LinkedList<Integer> nestingDepth(String str){
	String result = "answer";
	int nestEl = 0;
	int nestDepth = 0;

	LinkedList<Integer> intList = new LinkedList<Integer>();
	LinkedList<Integer> depth = new LinkedList<Integer>();
	
	
	for(int i = 0; i < str.length(); i++){
		intList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
	}
	
	int count = 0;
	int instance = 1;
	int currEl = 0;
	int factor1 = 1;
	int factor2 = 1;
	
	while(true){
		if(intList.get(count) != intList.get(count + 1) && count != intList.size() && instance == 1){
			nestEl = intList.get(count);
			nestDepth = count+1 - nestDepth*factor2;
			depth.add(nestEl);
			depth.add(nestDepth);
			count = count + 1;
			factor2 = factor2*2;
			instance = 0;
		}
		if(intList.get(count) != intList.get(count + 1) && count != intList.size() && instance == 0){
			
			nestEl = intList.get(count);
			nestDepth = count+1 - nestDepth*factor1;
			depth.add(nestEl);
			depth.add(nestDepth);
			instance = 1;
			factor1 = factor1*2;
			count = count + 1;
			
		}
		
		count = count + 1;	
		if(count > intList.size()-1){
			break;
		}
	
	}
	
	
	return depth;

	}

}

//working examples
//222000