class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set= new HashSet<>();
        if(nums.length==0){
            return new ArrayList<>(set);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]+(nums[i])==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    if(j<k && nums[j]==nums[j+1])j++;
                    if(j<k && nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}