class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum =0;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }
        int leftsum=0;
        int rightsum=totalsum;
        for(int i=0;i<nums.length;i++){
            rightsum=rightsum-nums[i];
            if(leftsum==rightsum)return i;
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}