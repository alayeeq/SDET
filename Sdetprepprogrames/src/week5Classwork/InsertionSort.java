package week5Classwork;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	
	
	@Test
	public void Test1() {
		
		int [] input = {5,4,3,2,1};
		
		System.out.println(Arrays.toString(sortbyinsertion(input)));
		
	}

	private int[] sortbyinsertion(int[] input) {
		// TODO Auto-generated method stub
		
		
		for (int i=1; i<input.length; i++) {
			
			
			for (int j =i; j>0 ; j--) {
				
				if (input[j]<input[j-1]) 	{
					
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		return input;
	}
	
	
	private int[] sortbyinsertionM2(int[] input) {
		// TODO Auto-generated method stub
		
		
		for (int i=1; i<input.length; i++) {
			
			
			for (int j =i; j>0 ; j--) {
				
				if (input[j]<input[j-1]) 	{
					
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		return input;
	}

}
