class Solution {
    public int evalRPN(String[] tokens) {
        Stk stack= new Stk();
        for(String i: tokens){
            if(i.equals("+")||i.equals("/")||i.equals("*")||i.equals("-")){
                int val1=stack.pop();
                int val2=stack.pop();
                if(i.equals("+")){
                    stack.add(val1+val2);
                }
                else if(i.equals("-")){
                    stack.add(val2-val1);
                }
                else if(i.equals("/")){
                    stack.add(val2/val1);
                }
                else if(i.equals("*")){
                    stack.add(val1*val2);
                }
            }
            else{
                stack.add(Integer.parseInt(i));
            }
        }
        
        return stack.pop();
    }
}
class Stk{
    class node{
        int val;
        node next;
        public node(int a){
            val=a;
            next=null;
        }
    }
    node head;
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void add(int a){
        if (isEmpty()){
            head= new node(a);
        }
        else{
            node ptr= new node(a);
            ptr.next=head;
            head=ptr;
        } 
    }
    public int pop(){
        if(!isEmpty()){
            int val=head.val;
            head=head.next;
            return val;
        }
        else{
            return 0;
        }
    }
}