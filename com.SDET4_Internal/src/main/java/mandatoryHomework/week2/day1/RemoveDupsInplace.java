package mandatoryHomework.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDupsInplace {

	
	/*
	 * int left = 0, right = nums.length - 1;
        
        while(left<=right){
            if(nums[left]==val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                left++;
            }
            
        }
        
        return left;
        
        
        merge sort 
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder s1 = new StringBuilder();
        int i = 0, j = 0;
        for(int k = 0; k < len1+len2; k++) { 
            if(i < len1) {
                s1.append(word1.charAt(k));
                i++;
            }
            if(j < len2) {
                s1.append(word2.charAt(k));
                j++;
            }
        }
        return s1.toString();
	 * 
	 * 
	 * 
	 */
	
	
	

	@Test
	
	public void Test1() {
		
		
		int [] nums = {1,1,2};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
			//System.out.println(Arrays.toString(removedupsinplace(nums)));	
				
			System.out.println(removedupsinplace2(nums));	
				
				
		}
	
	//Input: nums = [0,0,1,1,1,2,2,3,3,4]
	
	
	@Test
	
	public void Test2() {
		
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
		//	System.out.println(Arrays.toString(removedupsinplace(nums)));	
			System.out.println(removedupsinplace2(nums));
				
				
				
		}
	
	@Test
	
	public void Test3() {
		
		
		int [] nums = {1,2,3,4};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
		//	System.out.println(Arrays.toString(removedupsinplace(nums)));	
			System.out.println(removedupsinplace2(nums));
				
				
				
		}
	
	@Test
	
	public void Test4() {
		
		
		int [] nums = {1,2};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
			//System.out.println(Arrays.toString(removedupsinplace(nums)));	
				
			System.out.println(removedupsinplace2(nums));
				
				
		}
	
	
	@Test
	
	public void Test5() {
		
		
		int [] nums = {1,1};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
			//System.out.println(Arrays.toString(removedupsinplace(nums)));	
			System.out.println(removedupsinplace2(nums));
				
				
				
				
		}
	
	@Test
	
	public void Test6() {
		
		
		int [] nums = {1,1,1};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
			//System.out.println(Arrays.toString(removedupsinplace(nums)));	
			System.out.println(removedupsinplace2(nums));
				
				
				
				
		}
	
	
	@Test
	
	public void Test7() {
		
		
		int [] nums = {1,1,2,3};
		
				int Output = 2;
						
			//	int [] output = {1,2,.,.};
			
			System.out.println(Arrays.toString(removedupsinplace(nums)));	
			//System.out.println(removedupsinplace2(nums));
				
				
				
				
		}

	private int [] removedupsinplace(int[] nums) {
		// TODO Auto-generated method stub
		
		if (nums.length <2) return nums;
		else {
		int left =0;
		int right = 1;
			
		while (right<= nums.length-1) {
			
			
			if(nums[left]==nums[right]) {
				
				
				
				while(nums[left]==nums[right]) 
				if(right==nums.length-1) { 
						
 
					
					System.out.println(left+1);
					return nums;
				}
			
						else  right++;
				
				nums[left+1]=nums[right];
				
				left++;
				//right++;
			}
			
			else if (nums[left]<nums[right]) {
				
				left++;
				right++;
				
			}
			
			
			
			
			
		}
		
		System.out.println(left+1);
		//System.out.println(Arrays.toString(nums));
		return nums;
		}
	}
	
	
	private int  removedupsinplace2(int[] nums) {
		// TODO Auto-generated method stub
		if (nums.length ==0) return 0;
		else  if (nums.length ==1) return nums.length;
		else {
		int left =0;
		int right = 1;
			
		while (right<= nums.length-1) {
			
			
			if(nums[left]==nums[right]) {
				
			
			
				
					while(nums[left]==nums[right]) 
						if(right==nums.length-1) return left+1;
					
					else  right++;
			
				
				nums[left+1]=nums[right];
				
				left++;
				right++;
		
			}
			
			else if (nums[left]<nums[right]) {
				
				left++;
				right++;
				
			}
			
			
			
			
			
		}
		
	//	System.out.println(left+1);
		//System.out.println(Arrays.toString(nums));
		return left+1;
		}
	}
	
	
}
