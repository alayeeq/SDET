package week4Classwork;

import org.junit.Test;
import java.util.HashMap;

public class GoodStringretry {
	
	
	/*
	 * get the input String
	 * 	 * get the first ss 
	 * 			iterate is and add it to the map sub that
	 * 				if key does not exist add key and set the value as default of 0 +1
	 * 				if key exist change the value to value +1
	 * 			
	 * 			check if keyst = three if yes set the good string count as 1
	 * 
	 * 			next slide the window from left 0 and right k+1 till k+1 is < length
	 * 			remove left
	 * 			add right;
	 * 			removal logic if value is >1 make is vwseezsalue -1
	 * 					if  value is not =1 remove the key and value
	 * 			
	 * 				z
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	@Test
	public void test1() {
		
		//String input= "yzzzzazaz";
		
		String input= "abcabcabc";
		findGoodStrings(input);
						
		
	}

	private void findGoodStrings(String input) {
		// TODO Auto-generated method stub
		
		
		HashMap<Character , Integer > HM = new HashMap<>();
		int target = 3;
		int goodString = 0;
		
		StringBuilder sb = new StringBuilder(input);
		
		 String temp = sb.substring(0,3);
		for (int i=0; i< target ; i++) { 
		 HM.put(temp.charAt(i), HM.getOrDefault(temp.charAt(i), 0)+1);
		 
		 
		 
		
		}
		if (HM.keySet().size()==3) goodString++;
		
		int left = 0;
		int right = target;
		
		for ( ; right <input.length(); left++ , right++) {
			
			if (HM.get(input.charAt(left))>1) HM.put(input.charAt(left), HM.getOrDefault(sb.charAt(left), 0)-1);
			
			else if (HM.get(input.charAt(left))==1) HM.remove(input.charAt(left));
			
			 HM.put(input.charAt(right), HM.getOrDefault(input.charAt(right), 0)+1);
			 
			 if (HM.keySet().size()==3) goodString++;
		}
		
		System.out.println(goodString);
		
	}
	
	
	
	
	

}
