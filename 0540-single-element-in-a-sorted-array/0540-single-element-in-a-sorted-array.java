class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=1;
        int high=nums.length-2;
        if(nums.length<2) return nums[0];//edge case for only one element
        if(nums.length>1){//edge case as if there is only one element low-1 can't be there 
        if(nums[low]!=nums[low-1])return nums[low-1];
        if(nums[high]!=nums[high+1])return nums[high+1];}
        while(low<=high){
            int mid=(low+high)/2;
            
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2==0){
                if(nums[mid]==nums[mid-1])high=mid-1;//Imagine equal pair like 11,22,33 indexs are 01
                else low=mid+1;
            }
            else{
                if(nums[mid]==nums[mid-1])low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}