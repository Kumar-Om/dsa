class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        int ans[]={-1,-1};

        while(l<=r){
            mid=(l+r)/2;
            if(target>nums[mid]){
                l=mid+1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                ans[0]=mid;
                r=mid-1;
            }
        }

        l=0;r=nums.length-1;mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(target>nums[mid]){
                l=mid+1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                ans[1]=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}