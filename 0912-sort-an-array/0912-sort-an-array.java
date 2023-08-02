class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
			int curr=nums[i];
			int j= i-1;
			while(j>=0 && curr<nums[j]){
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=curr;
		}
		return nums;
    }
}