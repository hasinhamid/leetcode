/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ptr=head;
        ListNode ptr2= head;
        if(head==null|| head.next==null|| head.next.next==null){
            return false;
        }
        while(ptr2!=null&&ptr2.next!=null){
            ptr=ptr.next;
            ptr2=ptr2.next.next;
            if(ptr2==ptr){
                return true;
            }
        }
        return false;
    }
}