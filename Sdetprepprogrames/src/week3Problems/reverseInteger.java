package week3Problems;

import org.junit.Test;

public class reverseInteger {
	
	
	
	
	
	
	
	
	@Test
	public void Test1() {
		
		
		int a = 4576;
		
		reverseint (a);
		
	}

	private void reverseint(int a) {
		// TODO Auto-generated method stub
		String s = "";
		int k = Integer.MAX_VALUE;
		while (k>0) {
		k= a/10 ;
		 s = s+a%10 +"";
		 
		 a=a/10;
		
		}
		
		System.out.println(s);
		
		
		
		
		
	}

}
