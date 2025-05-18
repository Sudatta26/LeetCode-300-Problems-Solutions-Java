class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefix_sum=0;
        int count=0;
        HashMap<Integer,Integer> prefix_map=new HashMap<>();
        prefix_map.put(0,1);

        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];
            if(prefix_map.containsKey(prefix_sum-goal)){
                count+=prefix_map.get(prefix_sum-goal);
            }
            prefix_map.put(prefix_sum,prefix_map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}