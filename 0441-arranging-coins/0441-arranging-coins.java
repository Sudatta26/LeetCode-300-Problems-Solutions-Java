class Solution {
    public int arrangeCoins(int n) {
        if(n<=0)return 0;
        int row=1;
        while(row<=n){
            n=n-row;
            row=row+1;
            if(row==n)return row;
            if(row>n)break;
            
        }
        return row-1;
    }
}