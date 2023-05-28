package week2Classwork;

import org.junit.Test;

public class ReplaceAllwithoutReplaceAllinString {
	
	
	
	
	@Test
	
	public  void Test1() {
		
		
		
		String input = "1.1.1";
		
		
		
		String [] input_split = input.split("\\.");
		String out_put = "";
		for(int i=0; i<input_split.length;i++) {
			if(i==input_split.length-1) out_put=out_put+input_split[i];
			else
			out_put=out_put+input_split[i]+"[.]";
		}
		
		
		System.out.println(out_put);
		
		
			
		
		
	}

}
