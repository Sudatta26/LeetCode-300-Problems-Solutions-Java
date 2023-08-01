class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(n<3){
            for(int i:map.keySet()){
                list.add(i);
            }
        }
        ///
        else{
            for(int val:map.keySet()){
                if(map.get(val)>n/3){
                    list.add(val);
                }
            }
        }
        return list;
    }
}