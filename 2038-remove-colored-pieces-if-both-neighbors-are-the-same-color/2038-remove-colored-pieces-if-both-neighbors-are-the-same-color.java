class Solution {
    public boolean winnerOfGame(String colors) {
        int numtrue=getcount(colors,'A');
        int numfalse=getcount(colors,'B');

        if(numtrue>numfalse)return true;
        return false;
    }
    public int getcount(String atr, char s){
        int count=0;
        for(int i=1;i<atr.length()-1;i++){
            if(atr.charAt(i)==s && atr.charAt(i)==atr.charAt(i-1) && atr.charAt(i)==atr.charAt(i+1) )count++;
        }
        return count;
    }
}