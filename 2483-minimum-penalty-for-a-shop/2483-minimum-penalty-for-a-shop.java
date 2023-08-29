class Solution {
    public int bestClosingTime(String customers) {
        int ans=0, res=0,pos=-1,i=-1;
        for(char c:customers.toCharArray()){
            i++;
            if(c=='Y')res++;
            else res--;
            if(res>ans){
                ans=res;
                pos=i;
            }
        }
        return pos+1;
    }
}