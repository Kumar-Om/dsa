class Solution {
    public int maxProduct(int[] nums) {
        int maxi=nums[0],pre=1,suf=1,n=nums.length;
        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suf==0){
                suf=1;
            }

            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suf));
        }
        return maxi;
    }
}