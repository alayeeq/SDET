package removeElement;

import java.util.Arrays;

import org.junit.Test;

public class TargetPositions {

	
	
	
//	@Test
	
	public void Test1() {
		
		int [] imput_array = { 1,2,2,3,4,5,6,6};
		
		int Target_value = 3;
		
		System.out.println(Arrays.toString(returnpositonarray(imput_array, Target_value )));
		
		
	}
	
	@Test
	
	public void Test2() {
		
		int [] imput_array = { };
		
		int Target_value = 7;
		
		System.out.println(Arrays.toString(returnpositonarray(imput_array, Target_value )));
		
		
	}
	
	//@Test
	
	public void Test3() {
		
		int [] imput_array = { 1,2,2,2,4,5,6,6};
		
		int Target_value = 2;
		
		System.out.println(Arrays.toString(returnpositonarray(imput_array, Target_value )));
		
		
	}

	private int [] returnpositonarray(int[] imput_array, int target_value) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int [] output_array = {-1,-1};
		int first_index = -1;
		int last_index = -1;
		
		for (int i = 0; i<imput_array.length ; i++) {
			
			
			if (imput_array[i]==target_value) {
				
				first_index = i;
				break;
			}
		}
			for (int j = first_index+1 ; j <imput_array.length ; j++) {
				
				if (imput_array[j]==target_value) {
					
					if (j > last_index)  last_index = j;
				}
				
			}
			
			
			if (first_index==-1) return  output_array  ;
			
			else if (last_index == -1) {
				
				output_array[0] = first_index;
				output_array[1] = first_index;
				return  output_array ;
			}
			
			else {
				
				output_array[0] = first_index;
				output_array[1] = last_index;
				return  output_array ;
			}
		
		
		
		
		
	//	return null;
	}


}
