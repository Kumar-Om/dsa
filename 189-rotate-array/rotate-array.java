class Solution {
    void reverse(int arr[],int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
    }
    public void rotate(int[] nums, int k) {
        //4 3 2 1 7 6 5
        //5 6 7 1 2 3 4
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        
        reverse(nums,0,n-1);
    }
}