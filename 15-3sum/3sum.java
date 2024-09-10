class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int j=0,k=0,s=0,n=nums.length;
        Arrays.sort(nums);
        //  -4 -1 -1 0 1 2
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            j=i+1;
            k=nums.length-1;
            
            while(j<k){
                s=nums[i]+nums[j]+nums[k];
                if(s<0){
                    j++;
                }
                else if(s>0){
                    k--;
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}