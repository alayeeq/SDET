package week2Classwork;

import org.junit.Test;

public class PresentofTwoInts {
	
	
	/*
	 boolean flagX = false, flagY = false;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] == x) flagX = true;
         if(arr[i] == y) flagY = true;
     }
     return flagX&&flagY;
     
      2     boolean flagX = false, flagY = false;
        for (int i = 0; ( i < arr.length && !flagX&& !flagY); i++) {
            if (arr[i] == x) flagX = true;
            if(arr[i] == y) flagY = true;
        }
        return flagX&&flagY;		
     */
	
	
	@Test
	public void Test1() {
		
		int [] input_array = {1,2,3,5,8};
		
		int A = 2;
		int B = 5;
		
		System.out.println(CheckAAndB(input_array, A, B));
		
	}

	private boolean CheckAAndB(int[] input_array, int a, int b) {
		// TODO Auto-generated method stub
		
		boolean AExixt = false;
		boolean BExixt = false;
		boolean output = false;
	    for (int i = 0; i < input_array.length; i++) {
	        if (input_array[i] == a ) {
	        	AExixt = true;
	        }
	        
	        if (input_array[i] == b ) {
	        	BExixt = true;
	        }
		
	        
	        if ( AExixt && BExixt)output = true;
		
		
	}
	
	    
	    return output;

}
	
	
	
	  private static String getTwosComp (String binary) {
		    for (int i = binary.length(); i < 32; i++) {
		      binary = "0" + binary;
		    }

		    String onesComp = "";
		    for (int i = 0; i < binary.length(); i++) {
		      if (binary.charAt(i) == '1') {
		        onesComp += '0';
		      } else {
		        onesComp += '1';
		      }
		    }

		    String output = "";
		    boolean carry = true;
		    for (int i = onesComp.length() - 1; i >= 0; i--) {
		      if (!carry) {
		        output = onesComp.charAt(i) + output;
		      } else if (carry && onesComp.charAt(i) == '0') {
		        output = '1' + output;
		        carry = false;
		      } else {
		        output = '0' + output;
		      }
		    }
		    if(carry) {
		      output = '1'+ output;
		    }

		    return output;
		  }

	
}
