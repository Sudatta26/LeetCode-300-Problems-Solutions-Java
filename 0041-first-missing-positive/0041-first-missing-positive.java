class Solution {
    public int firstMissingPositive(int[] nums) {
      int i = 0;
      while(i<nums.length){
          int correctpos = nums[i]-1;
          if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correctpos]){
              swap(nums , i, correctpos);
          }else{
          i++;}
      }
      for(int j = 0;j<nums.length;j++){
          if(nums[j] != j+1){
              return j+1;
          }
      }
      return nums.length+1;
      }
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }  
}