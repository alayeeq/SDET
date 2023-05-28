package week3Classwork;

import org.junit.Test;

public class MergeSortedArray {
	
	
	@Test
	public void Test1() {
		
		
		int [] input_array1 = {1,2,3,6,7};
		int [] input_array2 = {4,5,8};
		
		mergeintothirdarray(input_array1, input_array2);
		
		
		
		
		
	}

	private void mergeintothirdarray(int[] input_array1, int[] input_array2) {
		// TODO Auto-generated method stub
		
		int [] output = new int[input_array1.length+input_array2.length];
				

		
		int left = 0;
		int right = 0;
		int target = 0;
		
		while (target<output.length) {
		
			if (left<input_array1.length) {
			
			if (input_array1[left]>input_array2[right])
					
					output[target++] = input_array1[left++];
			
				else if (input_array1[left]<input_array2[right]) {
					output[target++] = input_array2[right++];
				
				}
			
				
			
			}
			
			
		}
		
		
		
		
	}
	

}
