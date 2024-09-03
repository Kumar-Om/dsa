class Solution {
    public int maxSubArray(int[] nums) {
        int s=0,maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            
            if(s<0){
                s=0;
            }
            s=s+nums[i];
            maxi=Math.max(maxi,s);
        }
        return maxi;
    }
}