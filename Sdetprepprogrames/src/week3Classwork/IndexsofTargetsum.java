package week3Classwork;

import org.junit.Test;

public class IndexsofTargetsum {

	
	@Test
	
	public void Test1() {
		
		
		int [] input_array = {1,2,3,4,1,2,3,4};
		
		int Target_sum = 7;
		
		indexofsumTarget(input_array, Target_sum);
		
		
		
	}
	
	
	@Test
	
	public void Test2() {
		
		
		int [] input_array = {1,2,3,44,1,2,3,4};
		
		int Target_sum = 44;
		
		indexofsumTarget(input_array, Target_sum);
			
		
		
	}
	
	@Test
	
	public void Test3() {
		
		
		int [] input_array = {1,2,3,44,1,1,1,1};
		
		int Target_sum = 3;
		
		indexofsumTarget(input_array, Target_sum);
		
		
		
	}
	
	@Test
	
	public void Test5() {
		
		
		int [] input_array = {1,1,44,1,1,1};
		
		int Target_sum = 3;
		
		indexofsumTarget(input_array, Target_sum);
		
		
		
	}

	private void indexofsumTarget(int[] input_array, int target_sum) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = 0;
		int sum =0;
		
		
		sum = sum+input_array[right];
		  
		
		
		if (sum==target_sum)  System.out.println(left + "," +right);
		
	  for ( right=1; right<input_array.length; right++) {
			
			sum = sum+input_array[right];
		  
			
			
			if (sum==target_sum)  System.out.println(left + "," +right);
			
		
			while(sum>target_sum &&left<=right) {
				
				left++;
				sum = sum -input_array[left-1];
				
				if (sum<target_sum) {
					
					break;
				}
				if (sum==target_sum) {
					System.out.println(left + "," +right);
					break;
				}
				
				
			}
			}
			
		}
		
		
		
		
	}
	
	
