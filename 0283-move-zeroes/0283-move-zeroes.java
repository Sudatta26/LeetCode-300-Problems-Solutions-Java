class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero_pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzero_pointer]=nums[i];
                nonzero_pointer++;
            }
        }
        while(nonzero_pointer<nums.length){
            nums[nonzero_pointer]=0;
            nonzero_pointer++;
        }

    }
}