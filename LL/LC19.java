package LL;
public class LC19{
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        LL arr = new LL(ar);
        arr.printLL();
        arr.head= removeNthFromEnd(arr.head,2);
        arr.printLL();
        
    }

    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            size++;
        }
        if(size==n){
            head= head.next;
            return head;
        }
        else if(size==1){
            head=null;
            return head;
        }
        else if (size==2){
            head.next=null;
             return head;
        }
        else{   
            int a= size-n;
            ListNode ptr1= head;
            ListNode ptr2= head.next;
            while(a>1){
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;                    
                a--;
            }
            ptr2 =ptr2.next;
            ptr1.next = ptr2;
           return head;
        }
    }
    
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}
 class LL{
    
    public ListNode head;
    public LL(int[] arr){
        for(Integer i:arr){
            addLast(i);
        }
    }
    public void addLast(int a){
        if(head==null){
            head= new ListNode(a);
        }
        else{
            ListNode ptr= head;
            while(true){
                if(ptr.next==null){
                    ptr.next=new ListNode(a);
                    break;
                }
                else{
                    ptr=ptr.next;
                }
            }
        }
    }
    public void printLL(){
        ListNode ptr=head;
        while(ptr!=null){
            if(ptr.next!=null){
                System.out.print(ptr.val+"->");
                ptr=ptr.next;
            }
            else{
                System.out.println(ptr.val);
                ptr=ptr.next;
            }
            
        }
    }
 }
 
