/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * jora tali dewa code
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode(1); //arbitury value
		ListNode result = curr;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                result.next=new ListNode(list1.val);
                result=result.next;
                list1=list1.next;
            }
            else{
                result.next= new ListNode(list2.val);
                result=result.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            while(list1!=null){
                result.next=new ListNode(list1.val);
                result=result.next;
                list1=list1.next;
            }
        }
        if(list2!=null){
            while(list2!=null){
                result.next=new ListNode(list2.val);
                result=result.next;
                list2=list2.next;
            }
        }
        return curr.next;

		
    }
}