class Solution {
    public int singleNonDuplicate(int[] nums) {
        int  l=1,n=nums.length,r=n-2,mid=0;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if((mid%2==1 && nums[mid]==nums[mid-1]) ||(mid%2==0 && nums[mid]==nums[mid+1])){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}