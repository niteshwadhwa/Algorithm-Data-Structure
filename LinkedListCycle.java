public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode test = new ListNode(100);
		
		while(head != null && head.next != null){
			if(head.next.next != null && head.next.next.equals(test)){
				return true;
			}else{
				test.next = head.next;
				head.next = test;
				head = test.next;
			}
		}
		
		return false;
        
    }
}