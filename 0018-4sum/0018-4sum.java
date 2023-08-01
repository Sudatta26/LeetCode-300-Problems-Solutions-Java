class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         HashSet<List<Integer>> set= new HashSet<>();
        if(nums.length<4){
            return new ArrayList<>(set);
        }
        Arrays.sort(nums);
        for(int m=0;m<nums.length-3;m++){
             if(m>0 && nums[m]==nums[m-1])continue;
        for(int i=m+1;i<nums.length-2;i++){
            if(i!=m+1 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                long sum =nums[m];
                sum=sum+nums[i];
                sum=sum+nums[j];
                sum=sum+nums[k];
                if(sum==target){
                    set.add(Arrays.asList(nums[m],nums[i],nums[j],nums[k]));
                    if(j<k && nums[j]==nums[j+1])j++;
                    if(j<k && nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
                }
                        return new ArrayList<>(set);
    
    }
}
    
