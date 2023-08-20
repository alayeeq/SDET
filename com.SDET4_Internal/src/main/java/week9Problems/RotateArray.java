package week9Problems;

import org.junit.Test;

public class RotateArray {

	
	
	/*
	 * 
	 *   1,2,3,4
	 *   4,1,2,3
	 *   3,4,1,2
	 *   2,3,4,1
	 *   
	 *   k=2
	 *   1,2,3,4
	 *   4,3,2,1
	 *   3,4,2,1
	 *   3,4,1,2
	 *   
	 *   k=3
	 *   1,2,3,4
	 *   4,3,2,1
	 *   2,3,4,1
	 *   
	 * 
	 */
	
	
	@Test
		public void test1() {
		
		System.out.println('a'-0);
		System.out.println('a'+0);
		
		
	}
	
	
	public void rotate(int[] nums, int k) {
        k = k%nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        
    }
    
    public void swap(int[] arr, int left, int right){
        
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
	
}
