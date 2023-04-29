package removeElement;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Test;

public class GoodString {
	
	
	/*
	 * find if the first substring of given length  is good 
	 * 		by adding to s set and finding if the size IS EQUAL TO K
	 * Iterate from kth index till length -1  element and repeat the following
	 * 		remove i-kth element and put kth element
	 * 			remove with following logic
	 * 				if first element.value =1 remove 
	 * 				if first element value >1 update value = value -1
	 * 
	 *
	 * 
	 */
	
	
	@Test
	public void Test1()
	
	{
		 
		String s = "aababcabc";
		int substring_size =3;
		System.out.println("first test results are");
		findGoodString (s,substring_size);
		
	}
	
	
	@Test
	public void Test2()
	
	{
		 
		String s = "abcabcabc";
		int substring_size =3;
		System.out.println("second test results are");
		findGoodString (s,substring_size);
		
	}

	
	@Test
	public void Test3()
	
	{
		 
		String s = "aaaaaaaa";
		int substring_size =3;
		System.out.println("Third test results are");
		findGoodString (s,substring_size);
		
	}
	
	
	@Test
	public void Test4()
	
	{
		 
		String s = "ab";
		int substring_size =3;
		System.out.println("Fourth test results are");
		findGoodString (s,substring_size);
		
	}
	
	
	private void findGoodString(String s, int substring_size) {
		// TODO Auto-generated method stub
		
		if(s.length()<substring_size) 	
			System.out.println("Invalid Input");
			
		else {
		
		LinkedHashMap<Character, Integer> map =  new LinkedHashMap<Character, Integer>();
		
		

		for (int j=0 ; j< substring_size ; j++) {
			
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
		
			
		}
		
		if (map.keySet().size()==substring_size)
		{
			System.out.println(map.keySet());
		}
		
		for (int i=substring_size; i <s.length() ; i++)
		{
			if (map.get(s.charAt(i-substring_size))>1) {
				
				map.put(s.charAt(i-substring_size),map.get(s.charAt(i-substring_size))-1);
				
			}
			
			else if (map.get(s.charAt(i-substring_size))==1) {
				map.remove(s.charAt(i-substring_size));
				
			}
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			if (map.keySet().size()==substring_size)
			{
				System.out.println(map.keySet());
			}
			
		}
		
		}
		
	}
	

}