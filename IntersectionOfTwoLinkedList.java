/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       
        ListNode headA1 = headA;
        int headA1Counter = 0;
        
        ListNode headB1 = headB;
        int headB1Counter = 0;
        
        if((headA == null && headB == null) || (headA == null && headB != null) || (headA != null && headB == null)){
            return null;
        }else{
            
            while(headA1.next != null){
                headA1 = headA1.next;
                headA1Counter++;
            }
            
            while(headB1.next != null){
                headB1 = headB1.next;
                headB1Counter++;
            }
            
            if(headA1Counter >= headB1Counter){
                for(int i=0;i<headA1Counter-headB1Counter;i++){
                    headA = headA.next;
                }
            }else{
                for(int i=0;i<headB1Counter-headA1Counter;i++){
                    headB = headB.next;
                }
            }
            
            while(headA.next!= null && headB.next != null){
                if(headA.val == headB.val){
                    return headA;
                }else{
                    headA = headA.next;
                    headB = headB.next;
                }
            }
            
            if(headA.val == headB.val){
                return headA;
            }
            return null;
            
        }
        
    }
}