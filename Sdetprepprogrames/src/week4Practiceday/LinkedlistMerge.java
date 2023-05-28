package week4Practiceday;

import org.junit.Test;

public class LinkedlistMerge {
	
	
	
	
	
	@Test
	public void Test1() {
		
		
		
		ListNode la1 = new ListNode(4);
		ListNode la2 = new ListNode(2, la1);
		ListNode la3 = new ListNode(1, la2);
		
		
		
		ListNode lb1 = new ListNode(4);
		ListNode lb2 = new ListNode(3, lb1);
		ListNode lb3 = new ListNode(1, lb2);
		
		
		
		
		
		
		
	}
	
	
	public class ListNode {
		    int val;
		    ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	
	
	
	
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

	        ListNode Target = new ListNode();

	        while(list1 != null || list2!=null){


	                if (list1 != null && list2==null){

	                          if(Target==null) { Target = list1;
	                          
	                            list1 = list1.next;

	                          }
	                               

	                                else {Target.next = list1;
	                                  list1 = list1.next;

	                                
	                                }

	                                   

	                }

	               else  if (list1 == null && list2 !=null){

	                     if(Target==null) 
	                     
	                     {
	                         Target = list2;
	                     list2 = list2.next;
	                               
	                     }
	                                else
	                                { Target.next = list2;
	                                
	                                list2 = list2.next;
	                                
	                                }
	                                     
	                    
	                }


	                else {


	                           if (list1.val < list2.val){

	                              if(Target==null) { Target = list1;
	                          
	                            list1 = list1.next;

	                          }
	                               

	                                else {Target.next = list1;
	                                  list1 = list1.next;

	                                
	                                }

	                           }


	                           
	                           else {

	                             if(Target==null) 
	                     
	                     {
	                         Target = list2;
	                     list2 = list2.next;
	                               
	                     }
	                                else
	                                { Target.next = list2;
	                                
	                                list2 = list2.next;
	                                
	                                }
	                 




	                }




	        }


	       
	        
	    }
	        return Target;
	 }
	
	
	
	

}
