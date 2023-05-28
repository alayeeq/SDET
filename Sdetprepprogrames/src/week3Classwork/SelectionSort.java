package week3Classwork;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	
	
	@Test
	public void Test1() {
	int [] input_array = {1,11,4,2,7,5,3};
	
	sortbyselection(input_array);
	}
	
	
	@Test
	public void Test2() {
	int [] input_array = {14,11,4,2,7,5,3};
	
	sortbyselection(input_array);
	}

	
	@Test
	public void Test3() {
	int [] input_array = {14,11,4,-2,7,5,3};
	
	sortbyselection(input_array);
	}


	private void sortbyselection(int[] input_array) {
		// TODO Auto-generated method stub
		
		
		for (int i=0; i <input_array.length-1 ; i++) {
			
			int min = Integer.MAX_VALUE;
			int min_index=-1;
			int j =i;
			for ( ; j<input_array.length ; j++) {
				
				if(input_array[j]<min) {
					
					min = input_array[j];
					 min_index =  j;
				}
				 
			}
			int temp = input_array[min_index];
			input_array[min_index] = input_array[i];
			input_array[i] = min;
			
			
		}
		
		System.out.println(Arrays.toString(input_array));
		
	}


}
