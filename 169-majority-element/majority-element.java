class Solution {
    public int majorityElement(int[] nums) {
        int c=0,el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                c2++;
            }
        }
        if(c2>nums.length/2){
            return el;
        }
        else{
            return -1;
        }
    }
}