class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1,r=arr.length-2,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}