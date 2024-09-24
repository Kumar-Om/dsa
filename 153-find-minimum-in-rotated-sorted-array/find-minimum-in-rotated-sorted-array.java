class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,mid=0,ans=Integer.MAX_VALUE;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[l]<=nums[r]){
                ans=Math.min(ans,nums[l]);
                return ans;
            }

            else if(nums[l]<=nums[mid]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                r=mid-1;
            }
        }
        return ans;
    }
}