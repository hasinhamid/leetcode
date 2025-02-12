class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        s=s.toLowerCase();
        for(char ch: s.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='0'&&ch<='9'){
                str=str+ch;
            }
        }
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}