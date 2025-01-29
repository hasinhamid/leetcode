class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int val=getVal(ch);
            if(i+1<s.length() && val<getVal(s.charAt(i+1))){
                sum-=val;
            }
            else{
                sum+=val;
            }
        }
        return sum;

    }
    public static int getVal(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
