package LL;

/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LC234 {
    public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
            else if(head.next.next==null){
                if(head.val!=head.next.val){
                    return false;
                }
                return true;
            }
                ListNode ptr1= head;
                ListNode ptr2= head;
                while( ptr2.next!=null && ptr2.next.next!=null){
                    ptr1=ptr1.next;
                    ptr2=ptr2.next.next;
                }
                ptr2= reverseList(ptr1.next);
                ptr1=head;
                while(ptr2!=null){
                    if(ptr1.val!=ptr2.val){
                        return false;
                    }
                    else{
                        ptr1=ptr1.next;
                        ptr2=ptr2.next;
                    }
                }
                return true;
            
    }

    public static ListNode reverseList(ListNode head){
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        while(ptr2!=null){
            ListNode ptr3= ptr2.next;
            ptr2.next=ptr1;
            ptr1=ptr2;      
            ptr2=ptr3;
        }
        head.next= null;
        head=ptr1;
        return head;
    }
}