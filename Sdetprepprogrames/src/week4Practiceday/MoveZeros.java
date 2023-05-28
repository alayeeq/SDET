package week4Practiceday;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
	
	
	@Test
	
	public void Test1() {
		
		
		int [] input = {0,1,0,3,12};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}
	
	@Test
	
	public void Test2() {
		
		
		int [] input = {0,1,0};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}
	
	
	@Test
	
	public void Test3() {
		
		
		int [] input = {0};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}
	
	@Test
	
	public void Test4() {
		
		
		int [] input = {0,0,0,0,0,0};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}
	
	@Test
	
	public void Test5() {
		
		
		int [] input = {1,1,1,1,1,1};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}

	
	@Test
	
	public void Test6() {
		
		
		int [] input = {1,1,1,1,1,0};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}
	
	@Test
	
	public void Test7() {
		
		
		int [] input = {1,0,1};
		
		
		System.out.println(Arrays.toString(moveZeros(input)));
		
		
		
	}


	private int[] moveZeros(int[] input) {
		// TODO Auto-generated method stub
		
		
		
		
		for (int left =0, right =0; right<input.length; right++) {
			
			if(input[left]==0 && input[right] !=0) {
				
				int temp = input[left];
				input[left++] = input[right];
				input[right] = temp;
				
			}
			
			else if (input[left]!=0) left++;
				
			
			
				
			
			
		}
		
		
		return input;
	}

}
