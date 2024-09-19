class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int map[]=new int[101];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        int res[]=new int[2];int j=0;
        for(int i=0;i<map.length;i++){
            if(map[i]==2){
                res[j]=i;j++;
            }
        }
        return res;
    }
}