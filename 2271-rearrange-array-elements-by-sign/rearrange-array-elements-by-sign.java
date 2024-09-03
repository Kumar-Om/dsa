class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi=0,ni=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[pi]=nums[i];
                pi+=2;
            }
            else{
                res[ni]=nums[i];
                ni+=2;
            }
        }
        return res;
    }
}