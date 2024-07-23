class Solution {
    public int[] frequencySort(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       return Arrays.stream(nums).boxed().sorted((a,b) -> {
                int freq=map.get(a)-map.get(b);
                if(freq!=0){
                    return freq;
                }
                else{
                    return b-a;
                }
            }
       ).mapToInt(n->n).toArray();
    }
}