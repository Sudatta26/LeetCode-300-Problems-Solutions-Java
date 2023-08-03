class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count++;
            }
            else if(ele!=nums[i]){
                count--;
            }
            else{count++;}
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                res++;
            }
        }
        if(res>nums.length/2){
            return ele;
        }
        return-1;
    }
}