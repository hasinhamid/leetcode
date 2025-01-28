import java.util.*;
public class LC2239 {
    class Solution {
        public int findClosestNumber(int[] nums) {
            int val=Math.abs(nums[0]);
            int ans=nums[0];
            for(int i=1;i<nums.length;i++){
                int a=Math.abs(nums[i]);
                if(val>a){
                    val=a;
                    ans=nums[i];
                }
                if(val==a){
                    if(a>ans){
                        ans=nums[i];
                    }
                }
            }
            return ans;
        }
    }
}
