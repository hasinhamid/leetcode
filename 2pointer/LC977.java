class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        // nicher ta 2 pointer er kaj kore
        int i=0,j=nums.length-1;
        int index=ans.length-1;
        while(index>=0){
            if(nums[i]>nums[j]){
                ans[index--]=nums[i++];
            }
            else{
                ans[index--]=nums[j--];
            }
            
        }
        return ans;
    }
    
}