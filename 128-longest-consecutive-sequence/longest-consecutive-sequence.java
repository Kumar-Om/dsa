class Solution {
    // 0 1 1 2
    // 1 2 3 4 100 200
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int l=1,c=0,last_small=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            if(last_small==nums[i]-1){
                c++;
                last_small=nums[i];
            }
            else if(last_small != nums[i]){
                last_small=nums[i];
                c=1;
            }
            l=Math.max(l,c);
        }
        
        return l;
    }
}