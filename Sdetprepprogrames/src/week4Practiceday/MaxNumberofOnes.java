package week4Practiceday;

import org.junit.Test;

public class MaxNumberofOnes {
	
	
	
	
	@Test
	public void Test1() {
		
		
		int [] input = {1,1,0,1,1,1};
		
		maxOnes(input);
		maxOnesM2(input);
		
		
	}

	private void maxOnesM2(int[] input) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}

	private void maxOnes(int[] input) {
		// TODO Auto-generated method stub
		
		int counter = Integer.MIN_VALUE;
		int temp_counter=0 ;
		for (int i=0; i<input.length; i++) {
			
			if(input[i]==1) temp_counter++;
			else {
				
			counter= 	Math.max(counter, temp_counter);
			temp_counter=0;
				
				
			}
			counter= 	Math.max(counter, temp_counter);
		}
		System.out.println(counter);
		
		
	}

}
