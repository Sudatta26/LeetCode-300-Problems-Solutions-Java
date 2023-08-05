class Solution {
    public String decodeAtIndex(String s, int k) {
        long size =0;
        for(int i=0;i<s.length();i++){
            char in =s.charAt(i);
            if(Character.isLetter(in)){
               size++;
            }
            else if(Character.isDigit(in)){
                size=size*Integer.parseInt(""+in);
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            k%=size;
            if(k==0 && Character.isLetter(ch)){
                return ""+ch;
            }
            if(Character.isDigit(ch)){
                size=size/Integer.parseInt(""+ch);
        }
            else size--;
    }
    return "";
}
}
//https://www.youtube.com/watch?v=p-GPuy01a7A&t=1261s