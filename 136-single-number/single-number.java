class Solution {
    public int singleNumber(int[] nums) {
        
        int n=nums.length;
        // 1 1 2 2 4
        int res=0;
        for(int i=0;i<n;i++){
            res=res^nums[i];
        }
        return res;
    }

}