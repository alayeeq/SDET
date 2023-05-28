package week4Practiceday;

import org.junit.Test;

public class MinimumWhilteOperation {
	
	
	/*
	 * 
	 * 
	 * 
	 * get the substring 0 to 7 indices
	 * count the numb of whites store it in min 
	 * iterate left to 0 and right target+1 ; till right is lenght of string 
	 * when left is removed if char is while min--
	 * when right is added if char is W min++
	 * 
	 *check if min is <min then assign min 
	 *return min
	 * currentIndex - window = index to be popped
	 */
	
	
	
	
	@Test
	public void Test1() {
		
		
		String input = "WBBWWBBWBW";
		int Targetseq = 7;
		
		findminwhiteconversion(input, Targetseq);
		
		
	}
	
	@Test
	public void Test2() {
		
		
		String input = "WBBWWBBBBW";
		int Targetseq = 7;
		
		findminwhiteconversion(input, Targetseq);
		findminwhiteconversionM2(input, Targetseq);
		
		
	}

	private void findminwhiteconversionM2(String input, int targetseq) {
		// TODO Auto-generated method stub
		
		int countofwhite = 0;
		String subs = input.substring(0,targetseq);
		
		for (int i=0; i<subs.length();i++ ) {
			
			if (subs.charAt(i)=='W') countofwhite++;
			
		}
		
		
		
		
		
		
	}

	private void findminwhiteconversion(String input, int targetseq) {
		// TODO Auto-generated method stub
		
		int countofwhite = 0;
				String subs = input.substring(0,targetseq);
				
				for (int i=0; i<subs.length();i++ ) {
					
					if (subs.charAt(i)=='W') countofwhite++;
					
				}
				
				for (int left = 0, right = targetseq ;right <input.length(); left++, right++ ) {
					
					int tempcountofwhite =countofwhite; 
					
					if (input.charAt(left)=='W') countofwhite--;
					if (input.charAt(right)=='W') countofwhite++;	
					
					if (tempcountofwhite<countofwhite) countofwhite = tempcountofwhite;
					
					
					
				}
		
				System.out.println(countofwhite);
		
		
	}
	
	

}
