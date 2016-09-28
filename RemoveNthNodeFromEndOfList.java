/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        while(head.next != null){
            arr.add(head);
            head = head.next;
        }
        arr.add(head);
        
        int number = arr.size()-n;
        
        if(number == 0 && arr.size() == 1){
            return null;
        }else if(number == 0 && arr.size() > 1){
            return arr.get(1);
        }else if(arr.size()-1 > number){
            arr.get(number-1).next = arr.get(number+1);
        }else if(arr.size()-1 == number && arr.size()> 1){
            arr.get(number-1).next = null;
        }
        
        return arr.get(0);
        
    }
}