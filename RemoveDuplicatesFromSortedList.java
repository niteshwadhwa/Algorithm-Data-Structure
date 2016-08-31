/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       
       ListNode head1 = head;
       
       if(head == null){
           return head;
       }else if(head.next  == null ){
           return head;
       }else{
           while(head.next != null){
               if(head.next.next == null){
                   if(head.val == head.next.val ){
                        head.next = null;
                   }else{
                       head=head.next;
                   }
               }else if(head.next.next != null && head.val == head.next.val){
                   head.next = head.next.next;
               }else{
                   head=head.next;
               }
           }
       }
       
       return head1;
       
    }
}