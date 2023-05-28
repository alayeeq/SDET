package week5Problems;

import org.junit.Test;
import java.util.Stack;
import java.util.ArrayList;

public class IsSubsequennce {
	
	
	@Test
	public void Test1() {
		
		String target = "ahbgdc";
		String input = "abc";
		
		isSubseq(target,input);
		
		ArrayList<Integer> al = new ArrayList<>();
		
				
		
	}

	private boolean isSubseq(String target, String input) {
		// TODO Auto-generated method stub
		
		if (input.length()<=0  ) return true;	
		else if (target.length()<=0 ) return false;	
		
		else {
		
		
			Stack<Character> st = new Stack<>();
			
			for (int i=input.length()-1; i>=0; i--) {
				
				st.push(input.charAt(i));
			}
			
			System.out.println(st);
			System.out.println(st.peek());
			
			
			for (int j=0; j<target.length(); j++) {
				
				
				
				if(st.peek()==target.charAt(j)) st.pop();
				if(st.size()==0) return true;
			}
			System.out.println(st);
			
			
			 return false;
		}
	}

}
