/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        else{
            ListNode pt=head,pt2=head.next,pt3=head.next.next;
            while(pt2.next!=null){
                pt2.next=pt;
                pt=pt2;
                pt2=pt3;
                pt3=pt3.next;
            }
            pt2.next=pt;
            head.next=null;
            head=pt2;
            return head;
        }
    }
}