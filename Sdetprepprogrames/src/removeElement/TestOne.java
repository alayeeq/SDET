package removeElement;

import java.util.Arrays;

import org.junit.Test;

public class TestOne { 
	
	@Test
	public void Testing() {
		
		int [] a = {1,3,5,2,3,-3,5,-5,3,0};
		int target = 3;
		
		int [] two =  ReturnRemovedArray( a ,  target);
		for (int i =0 ; i<two.length ; i++) {
			
			
			System.out.print(two[i]);
		}
		System.out.println();
		
	}
	
	@Test
	public void Testing2() {
		
		int [] a = {1,3,5,2,3,-3,5,-5,3,0};
		int target = 3;
		
		int [] two =  ReturnRemovedArray2( a ,  target);
		for (int i =0 ; i<two.length ; i++) {
			
			
			System.out.print(two[i]);
		}
		System.out.println();
		
	}
	
	
	@Test
	public void Testing3() {
		
		int [] a = {1,3,5,2,3,-3,5,-5,3,0};
		int target = 3;
		
		int [] two =  ReturnRemovedArray3( a ,  target);
		for (int i =0 ; i<two.length ; i++) {
			
			
			System.out.print(two[i]);
		}
		System.out.println();
		
	}
/*
 * 
 * 
 * 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,5,2,3,-3,5,-5,3,0};
		int [] B = {1,3,5,2,3,-3,5,-5,3,0};
		int [] c = {1,3,5,2,3,-3,5,-5,3,0};
		int target = 3;
		
		int [] two =  ReturnRemovedArray( a ,  target);
		for (int i =0 ; i<two.length ; i++) {
			
			
			System.out.print(two[i]);
		}
		System.out.println();
		
		int [] one =  ReturnRemovedArray2( B ,  target);
		for (int i =0 ; i<one.length ; i++) {
			
			
			System.out.print(one[i]);
		}
		System.out.println();
		
		
		int [] three =  ReturnRemovedArray3( c,  target);
		for (int J =0 ; J<three.length ; J++) {
			
			
			System.out.print(three[J]);
		}
		System.out.println();
			
	}
	*/
	
	private static int[] ReturnRemovedArray(int[] a, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right =0;
		for ( right =0; right <a.length ; right++) {
			
			if (a[left]!=target) {

				left++;
			}
			
			else if (a[left]==target) {
				
				if (a[right] == target ) {
					
					 
				}
				
				else if (a[right] != target) {
					
					int temp = a[right];
					a[right] = a[left];
					a[left++] = temp;
					
					
					
				}
			}
			
		}
		//return a;
		return Arrays.copyOf(a, left);
		 
		
	}
	
	
	private static int[] ReturnRemovedArray2(int[] b, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		//int right =0;
		for (int right =0; right <b.length ; right++) {
			
			if (b[right]!=target) {

				int temp = b[right];
				b[right] = b[left];
				b[left++] = temp;
			}
			
			
			
		}
		
		return Arrays.copyOf(b, left);
		//return b;
		 
		
	}
	
	private static int[] ReturnRemovedArray3(int[] c, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		//int right =0;
		for (int right =0; right <c.length ; right++) {
			
			if (c[right]!=target) {


				c[left++] = c[right];
			}	
			
			
			
		}
		
		return Arrays.copyOf(c, left);
		//return c;
		 
		
	}
	

}
