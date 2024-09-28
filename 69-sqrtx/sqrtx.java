class Solution {
    public int mySqrt(int x) {
        long l=1,r=x-1,mid=0,ans=0;
        if(x==1){
            return 1;
        }
        while(l<=r){
            mid=(l+r)/2;
            if(mid*mid<=x){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return (int)ans;
    }
}