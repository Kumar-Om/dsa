class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0,n=nums.length;
        int s=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                s++;
            }
            else{
                if(max<s){
                    max=s;
                }
                s=0;
            }
        }

        if(max<s){
            max=s;
        }

        return max;
    }
}