class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target){ 
                return true;
            }
            else if(nums[l]==nums[mid] && nums[r]==nums[mid]){
                l++;r--;
                continue;
            }
            else if(nums[l]<=nums[mid]){ //left sorted
                if(target>=nums[l] && target<=nums[mid]){  //lies within left sorted
                    r=mid-1;
                }
                else{ //if not
                    l=mid+1;
                }
            }
            else{ //right sorted
                if(target<=nums[r]&&target>=nums[mid]){  //lies within right sorted
                    l=mid+1;
                }
                else{ //if not
                    r=mid-1;
                }
            }

        }
        return false;
        
    }
}