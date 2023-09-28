class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}