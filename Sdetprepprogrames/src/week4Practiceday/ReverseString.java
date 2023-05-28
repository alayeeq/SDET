package week4Practiceday;

import org.junit.Test;

public class ReverseString {
	
	
	@Test
	public void Test1() {
		
		
		String input = "Apple";
		
	System.out.println(revString(input));
		
		
		
	}
	
	@Test
	public void Test2() {
		
		
		StringBuilder input = new StringBuilder("Apple");
		
	System.out.println(revStringM2(input));
		
		
		
	}

	private StringBuilder revStringM2(StringBuilder input) {
		// TODO Auto-generated method stub
		
		
		
		int left = 0;
		int right = input.length()-1;
		
		
		
		for (; left <right ; left++, right--) {
			
			char temp = input.charAt(left);
			
			input.setCharAt(left, input.charAt(right));
			input.setCharAt(right, temp);
			
			
			
		}
		
		return input;
	}

	private String revString(String input) {
		// TODO Auto-generated method stub
		
		
		
		StringBuilder sb = new StringBuilder(input);
		int left = 0;
		int right = input.length()-1;
		
		
		
		for (; left <right ; left++, right--) {
			
			char temp = sb.charAt(left);
			
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right, temp);
			
			
			
		}
		
		return sb.toString();
		
	}
	
	
	
	

}
