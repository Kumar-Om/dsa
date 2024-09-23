class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[l]==nums[mid] && nums[r]==nums[mid]){
                l++;r--;
                continue;
            }
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<=nums[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target<=nums[r]&&target>=nums[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }

        }
        return false;
        
    }
}