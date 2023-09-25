class Solution {
    public char findTheDifference(String s, String t) {
        int a=0;
        int b=0;
        for(int i=0;i<t.length();i++){
            a=a+t.charAt(i);
            if(i<s.length()) b=b+s.charAt(i);
        }
                
        int res=a-b;        
        return (char)res;
    }
}