class Solution {
    public boolean isMonotonic(int[] nums) {
        int incr=0;
        int decr=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                incr++;
            }
            if(nums[i]>=nums[i+1]){
                decr++;
            }
        }
        if(incr==nums.length-1 || decr==nums.length-1)return true;
        return false;
    }
}