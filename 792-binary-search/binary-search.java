class Solution {
    public int search(int[] nums, int target) {
        //changed
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(target>nums[mid]){
                l=mid+1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}