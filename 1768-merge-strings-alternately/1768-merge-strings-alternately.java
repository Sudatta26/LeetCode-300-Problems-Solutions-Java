class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder arr=new StringBuilder();
        while(i<=word1.length() || i<=word2.length()){
            if(i<word1.length())arr.append(word1.charAt(i));
            if(i<word2.length())arr.append(word2.charAt(i));
            i++;
        }
        return arr.toString();
    }
}