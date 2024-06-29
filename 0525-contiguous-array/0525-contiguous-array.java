class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();//<Result,Index>
        map.put(0,-1);
        int res=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)res=res-1;
            else if(nums[i]==1)res=res+1;

            if(map.containsKey(res)){
                int val=map.get(res);
                int rem=i-val;
                if(rem>sum)sum=rem;
            }
            else{
                map.put(res,i);
            }
        }
        return sum;
    }
}