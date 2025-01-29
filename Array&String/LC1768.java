class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        for(int i=0;i<word1.length()||i<word2.length();i++){
            if(i<word1.length() && i<word2.length()){
                char ch1=word1.charAt(i);
                char ch2=word2.charAt(i);
                str=str+ch1+ch2;
            }
            else{
                if(i<word1.length()){
                    str+=(char)word1.charAt(i);
                }
                if(i<word2.length()){
                    str+=(char)word2.charAt(i);
                }
            }
        }
        return str;
        
    }
}