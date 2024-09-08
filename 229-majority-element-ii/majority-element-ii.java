class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el=Integer.MIN_VALUE,c=0,n=nums.length;
        int el2=Integer.MIN_VALUE,c2=0;
        for(int i=0;i<n;i++){
            if(c==0 && nums[i]!=el2){
                c=1;
                el=nums[i];
            }
            else if(c2==0 && nums[i]!=el){
                c2=1;
                el2=nums[i];
            }
            else if(el==nums[i]){
                c++;
            }
            else if(el2==nums[i]){
                c2++;
            }
            else{
                c--;c2--;
            }
        }
        
        
        c2=0;c=0;
        for(int i=0;i<n;i++){
            if(el==nums[i]){
                c++;
            }
            else if(el2==nums[i]){
                c2++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        if(c>(n/3)){
            result.add(el);
        }
         if(c2>(n/3)){
            result.add(el2);
        }

        return result;
    }
}