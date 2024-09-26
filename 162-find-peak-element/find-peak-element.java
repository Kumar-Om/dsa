class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        //edge cases
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }


        int l=1,r=n-2,mid=0;

        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            //left inc
            else if(nums[mid]>nums[mid-1]){ 
                l=mid+1;
            }
            //right dec
            else if(nums[mid]>nums[mid+1]){
                r=mid-1;
            }
            //if two peak and mid is in the valley of two peaks then go left or right
            else{
                l=mid+1; //we go left
            }
        }
        return -1;
    }
}