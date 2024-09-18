class Solution {

    void merge(int nums[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int left=si,right=mid+1,x=0;

        while(left<=mid && right<=ei){
            if(nums[left]<=nums[right]){
                merged[x++]=nums[left++];
            }
            else if(nums[right]<=nums[left]){
                merged[x++]=nums[right++];
            }
        }

        while(left<=mid){
            merged[x++]=nums[left++];
        }
        while(right<=ei){
            merged[x++]=nums[right++];
        }

        int j=si;
        for(int i=0;i<merged.length;i++){
            nums[j++]=merged[i];
        }
    }
    int divide(int nums[],int si,int ei){
        int c=0;
        if(si>=ei){
            return c;
        }
        int mid=si+(ei-si)/2;
        c=c+divide(nums,si,mid);
        c+=divide(nums,mid+1,ei);
        c+=count_reverse(nums,si,mid,ei);
        merge(nums,si,mid,ei);
        return c;
    }

    int count_reverse(int nums[],int si,int mid,int ei){
        int c=0;
        int right=mid+1;

        for(int i=si;i<=mid;i++){
            while(right<=ei && (long)nums[i]>2L*nums[right]){
                right++;
            }
            c=c+(right-(mid+1));

        }
        return c;
    }
    public int reversePairs(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
}