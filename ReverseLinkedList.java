/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode Start = null;
        ListNode Start1 = null;
        
        if(head == null){
            return null;
        } else if(head.next == null){
           return head;
        }else{
            ListNode RecursiveHead = head;
            head = head.next;
            Start = reverseList(head);
            Start1 = Start;
            while(Start1.next != null){
                Start1= Start1.next;
            }
            RecursiveHead.next = null;
            Start1.next = RecursiveHead;
        }
        
        return Start;
        
    }
    
}