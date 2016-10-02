/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 
 
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if((head == null) || ((head.next == null) && (head.val == val))){
            return null;
        }else{
            
            ListNode head1 = head;
            
            while(head.next != null){
                
                if((head.next.val == val) && (head.next.next != null)){
                    head.next = head.next.next;
                }else if((head.next.val == val) && (head.next.next == null)){
                    head.next = null;
                    break;
                }else if((head.next.val != val) && (head.next.next != null)){
                    head = head.next;
                }else if((head.next.val != val) && (head.next.next == null)){
                    head = head.next;
                    break;
                }
                
            }
            
            if((head1.next == null) && (head1.val == val)){
                return null;
            }else{
                while(head1.next != null){
                    if(head1.val == val){
                        head1=head1.next;
                    }else{
                        break;
                    }
                }
            }
            
            return head1;
        }
        
        
        
    }
}