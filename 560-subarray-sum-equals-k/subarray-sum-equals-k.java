
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        //prefix sum
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }

        for(int i=0;i<n;i++){
            int key=nums[i]-k;
            if(map.containsKey(key)){
                c=c+map.get(key);
            }
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return c;
    }
}