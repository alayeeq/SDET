package week3Classwork;

import org.junit.Test;

public class MaxSumkSW {


	
	@Test
	public void Test1() {
		
		int [] input_array = {1,5,2,3,7,1};
		
		int Target_sum = 3;
		
		
	System.out.println(maxSum (input_array, Target_sum));
		
	}
	
	@Test
	public void Test2() {
		
		int [] input_array = {1,2,3,4,5,6,7,8,9};
		
		int Target_sum = 3;
		
		
		System.out.println(maxSum (input_array, Target_sum));
		
	}
	
	@Test
	public void Test3() {
		
		int [] input_array = {9,8,7,6,5,4,3,2,1};
		
		int Target_sum = 3;
		
		
		System.out.println(maxSum (input_array, Target_sum));
		
	}
	
	
	@Test
	public void Test4() {
		
		int [] input_array = {9,8};
		
		int Target_sum = 3;
		
		
		System.out.println(maxSum (input_array, Target_sum));
		
	}
	
	@Test
	public void Test5() {
		
		int [] input_array = {9,8};
		
		int Target_sum = 2;
		
		
		System.out.println(maxSum (input_array, Target_sum));
		
	}
	
	@Test
	public void Test6() {
		
		int [] input_array = {9,8};
		
		int Target_sum = 3;
		
		
		System.out.println(maxSum (input_array, Target_sum));
		
	}

	private int maxSum(int[] input_array, int target_sum) {
		// TODO Auto-generated method stub
		
		if (input_array.length<target_sum) return -1;
		
		
		
		int sum=0;
		int max_sum = Integer.MIN_VALUE;
		for (int j=0; j<target_sum; j++) {
			
			sum = sum + input_array[j];
			if (sum>max_sum) max_sum = sum;
		}
		
		
		for (int i=target_sum; i<input_array.length ; i++) {
			
				sum = sum +input_array[i] -input_array[i-target_sum];
				
				if (sum>max_sum) max_sum = sum;
				
				
			
		}
		
	//	System.out.println(max_sum);
		return max_sum;
	}


}
