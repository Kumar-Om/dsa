class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi=0,ni=0;
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pi]=nums[i];
                pi++;
            }
            else{
                neg[ni]=nums[i];
                ni++;
            }
        }
        pi=0;
        ni=0;
        int ri=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[ri]=pos[pi];
                ri++;pi++;
            }
            else{
                res[ri]=neg[ni];
                ri++;ni++;
            }
        }
        return res;
    }
}