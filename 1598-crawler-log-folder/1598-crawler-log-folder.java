class Solution {
    public int minOperations(String[] logs) {
        int res=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(res>0)res--;
            }
            else if(!logs[i].equals("./")){
              res++;  
            }
        }
        if(res>0)return res;
        return 0;
    }
}