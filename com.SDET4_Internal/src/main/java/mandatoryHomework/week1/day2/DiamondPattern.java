package mandatoryHomework.week1.day2;

import org.junit.Test;

public class DiamondPattern {
	
	
	@Test
	
	public void Test1() {
		
		int input = 5;
		
		printDiamond(input);
		
		
	}

	private void printDiamond(int input) {
		// TODO Auto-generated method stub
		int row =0;
		int column =0;
		int spaces =0;
		int column_limit = 0;
		int space_limit = 0;
		for ( row=1 ; row<2*input ; row++) {
			
			
			
			if (row <=input) {
				
				column_limit = row;
				space_limit = (input+1)-row;
				
			}
			
			else {
				
				column_limit = 2*input -row;
				space_limit = row -(input-1);
			}
			
			for (spaces =0 ; spaces <space_limit ; spaces++) {
				
				System.out.print(" ");
			}
			
			
			for (column =0 ; column <column_limit ; column++) {
				
				System.out.print(" *");
			}
			
			System.out.println();
			
			
			
		}
		
	}
	

}
