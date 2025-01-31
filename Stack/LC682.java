import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk= new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C") && !stk.isEmpty()){
                stk.pop();
            }
            else if(operations[i].equals("D") && !stk.isEmpty()){
                int a= stk.peek();
                stk.push(a*2);
            }
            else if(operations[i].equals("+")){
                if(stk.size()>=2){
                    int a=stk.pop();
                    int b= stk.peek();
                    stk.push(a);
                    stk.push(a+b);
                } 
            }
            else{
                stk.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(Integer a:stk){
            sum+=a;
        }
        return sum;
    }
}