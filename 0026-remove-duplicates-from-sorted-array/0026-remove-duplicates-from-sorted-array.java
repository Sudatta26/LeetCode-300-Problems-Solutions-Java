class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[count]=nums[i];
                count++;
                i=j;
            }
            j++;
        }
        nums[count]=nums[i];
        return count+1;
    }
}