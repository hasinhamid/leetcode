class Solution {
    public int search(int[] nums, int target) {
        int a= BS(nums,0,nums.length-1,target);
        return a;
    }
    public int BS(int[] arr, int left, int right, int target){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        int ta=arr[mid];
        int idx=-1;
        if(left==right && ta!=target){
            return -1;
        }
        if(ta==target){
            return mid;
        }
        else if(ta<target){
            idx=BS(arr,mid+1,right,target);
        }
        else if(ta>target){
            idx=BS(arr,left,mid,target);
        }
        return idx;
    }

    
}