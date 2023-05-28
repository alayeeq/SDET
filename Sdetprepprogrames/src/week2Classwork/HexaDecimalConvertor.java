package week2Classwork;

import org.junit.Test;

public class HexaDecimalConvertor {

	
	@Test
	public void Test1() {
		
		
		int input = 47;
		
		convertHex(input);
		
		
	}
	
	
	@Test
	public void Test2() {
		
		
		int input = 2;
		
		convertHex(input);
		
		
	}

	private void convertHex(int input) {
		// TODO Auto-generated method stub
		
		
		int quotient = input ;
		
		String remainder = "" ;
		String remainder_temp = null;
		char temp = 'x';
		
		while(quotient >0 ) {
			
			quotient = input/16;
			
			
				
			
			
			if (input%16 ==10) remainder_temp = "A";
			else if (input%16 ==11) remainder_temp = "B";
			else if (input%16 ==12) remainder_temp = "C";
			else if (input%16 ==13) remainder_temp = "D";
			else if (input%16 ==14) remainder_temp = "E";
			else if (input%16 ==15) remainder_temp = "F";
			else {
				
			   remainder_temp = Integer.toString((input%16));
			  
			  
			}
			remainder = remainder_temp +remainder;
			
			input = quotient;
		}
		
		System.out.println(remainder);
		
		
		
	}
	
	
	
	
	
}
