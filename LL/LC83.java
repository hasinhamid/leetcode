/*
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr= head;
        if(head!=null){
            ListNode ptr1= head.next;
            while(ptr1!=null){
                if(ptr.val!=ptr1.val){
                    ptr=ptr.next;
                    ptr1=ptr1.next;
                }
                else{
                    ptr.next=ptr1.next;
                    ptr1=ptr1.next;
                }
            }
        }
        return head;
    }
}