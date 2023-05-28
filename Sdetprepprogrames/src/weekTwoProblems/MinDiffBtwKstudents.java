package weekTwoProblems;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.TreeMap;
public class MinDiffBtwKstudents {
	
	
	
	@Test
	public void Test1() {
		
		
		int []input = {9,4,1,7}; 
		int target_compare = 2;
		
		minscoreofk (input, target_compare);
		
		
	}

	private void minscoreofk(int[] input, int target_compare) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet <Integer> ();
		
		TreeMap<Integer,Integer> TM= new TreeMap<Integer,Integer>();
		for (int i=0; i<input.length; i++) {
		
		lhs.add(input[i]);
		TM.put(input[i], input[i]);
		}
		
		System.out.println(lhs);
		System.out.println(TM.keySet());
	}

}
