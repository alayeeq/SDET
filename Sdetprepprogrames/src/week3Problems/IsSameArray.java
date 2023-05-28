package week3Problems;

import org.junit.Test;
import java.util.HashMap;
import java.util.Set;


public class IsSameArray {
	
	
	@Test
	public void Test1() {
		
		
		int [] arr1 = {1,2,3,4,4,5,6};
		int [] arr2 = {4,5,6,1,2,3,7};
		
		System.out.println(Issame(arr1,arr2));
		
		
	}
	
	@Test
	public void Test2() {
		
		
		int [] arr1 = {1,2,3,4,4,5,6};
		int [] arr2 = {4,5,6,1,2,3};
		
		System.out.println(Issame(arr1,arr2));
		
		
	}
	
	@Test
	public void Test3() {
		
		
		int [] arr1 = {1,2,3,4,4,5,6,7};
		int [] arr2 = {4,5,6,1,2,3};
		
		System.out.println(Issame(arr1,arr2));
		
		
	}
	
	@Test
	public void Test4() {
		
		
		int [] arr1 = {1,2,3,4,4,5,6,7};
		int [] arr2 = {4,5,6,1,2,3};
		
		System.out.println(Issame(arr1,arr2));
		
		
	}
	
	@Test
	public void Test5() {
		
		
		int [] arr1 = {1,2,3};
		int [] arr2 = {3,3,3,3,3,2,2,2,2,2,2,1};
		
		System.out.println(Issame(arr1,arr2));
		
		
	}


	private boolean Issame(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		
		boolean same = true;
		HashMap <Integer , Integer> hm1 = new HashMap <>();
		HashMap <Integer , Integer> hm2 = new HashMap <>();
		
		for (int i =0; i<arr1.length ; i++) {
			
			hm1.put(arr1[i], null);
			
			
		}
		
	for (int i =0; i<arr2.length ; i++) {
			
			hm2.put(arr2[i], null);
			
			
		}
		
	
	Set<Integer> s = hm1.keySet();
		
	for (Integer z : s) {
		
		if(!hm2.containsKey(z)) same = false;
		
		
		
	}
	
	Set<Integer> s2 = hm2.keySet();
	for (Integer z : s2) {
		
		if(!hm1.containsKey(z)) same = false;
		
		
		
	}
	  
		
		return same;
		
	}
	
	
	
	

}
