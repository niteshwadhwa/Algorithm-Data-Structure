/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode head1 = head;
        if(head == null){
            ;
        }else{
            while(head.next != null){
                if(head.next.val ==  head.val && head.next.next != null){
                    head.next = head.next.next;
                }else if(head.next.val ==  head.val && head.next.next == null){
                    head.next = null;
                }else{
                    head = head.next;
                }
            }
        }
    
        return head1;
        
    }
}