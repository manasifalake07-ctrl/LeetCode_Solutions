class Solution {
    public int lengthOfLastWord(String s) {
        //TS(n)
        String [] words = s.trim().split("\\s+");
        String LastWord = words[words.length - 1];
        return(LastWord.length());
    }
}