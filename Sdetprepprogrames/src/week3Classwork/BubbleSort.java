package week3Classwork;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	
	@Test
	public void Test1() {
	int [] input_array = {1,11,4,2,7,5,3};
	
	sortbyBubble(input_array);
	}
	
	
	@Test
	public void Test2() {
	int [] input_array = {1,11,4,-2,7,5,3};
	
	sortbyBubble(input_array);
	}
	
	@Test
	public void Test3() {
	int [] input_array = {1,2,3,4,5,6};
	
	sortbyBubble(input_array);
	}
	
	@Test
	public void Test4() {
	int [] input_array = {1,2,4,3,5,6};
	
	sortbyBubble(input_array);
	}

	private void sortbyBubble(int[] input_array) {
		// TODO Auto-generated method stub
		
		int stop_index = input_array.length-1;
		int swap = 0;
		
		while(stop_index>0) {  // instead of while we can two for loop with limit of inner loop length - outer loops i
		for (int i=0 ; i<stop_index ; i++) {
			if (input_array[i]>input_array[i+1]) {
			int temp = input_array[i+1];
			input_array[i+1]= input_array[i];
			
			input_array[i] = temp;
			swap++;
			}
			
			
			
		}
		if (swap==0) break;
		stop_index = stop_index -1;
		}
		
		System.out.println(Arrays.toString(input_array));
		System.out.println("No of swaps = " +swap);
		
	}
	
}
