class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> resultlist=new ArrayList<>();
        backtrack(resultlist,new ArrayList<>(),nums);
        return resultlist;
    }
    public void backtrack(ArrayList<List<Integer>> resultlist, ArrayList<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            resultlist.add(new ArrayList<>(tempList));
            return;
        }
        for(int numbers:nums){
            if(tempList.contains(numbers))continue;
            tempList.add(numbers);
            backtrack(resultlist,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}