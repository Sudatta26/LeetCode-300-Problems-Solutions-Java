class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for(int j=0;j<words.length;j++){
        for(int i=words[j].length()-1;i>=0;i--){
            sb.append(words[j].charAt(i));
        }
        if(j+1==words.length)break;
        sb.append(" ");
        }
        return sb.toString();
    }
}